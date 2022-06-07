# SPDX-License-Identifier: Apache-2.0
# Copyright © 2022 Josh Marshall (joshua.r.marshall.1991@gmail.com)

"""
Support for Antlr4 grammar transpiler.
"""

import typing as T

from .. import coredata
from ..mesonlib import EnvironmentException, MachineChoice, OptionKey
from .compilers import Compiler, antlr4_buildtype_args

if T.TYPE_CHECKING:
    from ..coredata import (
        MutableKeyedOptionDictType,
        KeyedOptionDictType,
        UserComboOption,
    )
    from ..environment import Environment


class Antlr4Transpiler(Compiler):
    language = "antlr4"
    id = "antlr4"

    """
    Antlr4 Cpp Compiler.

    For proof of concept, specialize for the C++ case to keep the
    first implementation simpler.

    TODO: support the following flags
    -lib ___            specify location of grammars, tokens files
    -atn                generate rule augmented transition network diagrams
    -encoding ___       specify grammar file encoding; e.g., euc-jp
    -message-format ___ specify output style for messages in antlr, gnu, vs2005
    -long-messages      show exception details when available for errors and warnings
    -listener           generate parse tree listener (default)
    -no-listener        don't generate parse tree listener
    -visitor            generate parse tree visitor
    -no-visitor         don't generate parse tree visitor (default)
    -package ___        specify a package/namespace for the generated code
    -depend             generate file dependencies
    -D<option>=value    set/override a grammar-level option
    -XdbgST             launch StringTemplate visualizer on generated code
    -XdbgSTWait         wait for STViz to close before continuing
    -Xforce-atn         use the ATN simulator for all predictions
    -Xlog               dump lots of logging info to antlr-timestamp.log
    """

    def __init__(
        self,
        exelist: T.List[str],
        version: str,
        for_machine: MachineChoice,
        info: "MachineInfo",
        linker: T.Optional["DynamicLinker"] = None,
        full_version: T.Optional[str] = None,
        is_cross: bool = False,
    ):
        super().__init__(
            exelist=exelist,
            version=version,
            for_machine=for_machine,
            info=info,
            linker=linker,
            full_version=full_version,
            is_cross=is_cross,
        )

        self.target_languages = ['dart', 'c#','c++','go','java','js','python','php','swift']

        # -Dlanguage=
        self.language_key = OptionKey(
            "language", machine=self.for_machine, lang=self.language
        )
        self.language_options = coredata.UserComboOption(
            "Set the grammar to transpile to dart c#, c++, go, java, js, python, php, or swift files.",
            list(self.target_languages),
            "java",
        )

        # -DsuperClass
        self.super_class_key = OptionKey(
            "superClass", machine=self.for_machine, lang=self.language
        )
        self.superClass_options = coredata.UserStringOption(
            "Set the superclass of the generated parser or lexer.",
            "",
        )

        # -DtokenVocab
        self.token_vocab_key = OptionKey(
            "tokenVocab", machine=self.for_machine, lang=self.language
        )
        self.tokenVocab_options = coredata.UserStringOption(
            "See https://github.com/antlr/antlr4/blob/master/doc/options.md#tokenvocab",
            "",
        )

        # -DTokenLabelType
        self.token_label_type_key = OptionKey(
            "TokenLabelType", machine=self.for_machine, lang=self.language
        )
        self.TokenLabelType_options = coredata.UserStringOption(
            "See https://github.com/antlr/antlr4/blob/master/doc/options.md#tokenlabeltype",
            "",
        )

        # -DcontextSuperClass
        self.context_super_class_key = OptionKey(
            "contextSuperClass", machine=self.for_machine, lang=self.language
        )
        self.contextSuperClass_options = coredata.UserStringOption(
            "Specify the super class name of parse tree internal nodes.",
            "",
        )

        # -DcaseInsensitive
        self.case_insensitive_key = OptionKey(
            "caseInsensitive", machine=self.for_machine, lang=self.language
        )
        self.caseInsensitive_options = coredata.UserBooleanOption(
            "Use case-insensitive lexing; better specified as an in-file grammar option.",
            False,
        )

        # -lib ___
        self.lib_key = OptionKey("lib", machine=self.for_machine, lang=self.language)
        self.lib_options = coredata.UserStringOption(
            "specify location of grammars, tokens files.",
            "",
        )

        # -atn
        self.atn_key = OptionKey("atn", machine=self.for_machine, lang=self.language)
        self.atn_options = coredata.UserBooleanOption(
            "Generate rule augmented transition network diagrams.",
            False,
        )

        # -encoding ___       specify grammar file encoding; e.g., euc-jp
        self.encoding_key = OptionKey(
            "encoding", machine=self.for_machine, lang=self.language
        )
        self.encoding_options = coredata.UserStringOption(
            "Specify grammar file encoding; e.g., euc-jp.  Defaults to utf-8.",
            "utf-8",
        )

        # -message-format ___ specify output style for messages in antlr, gnu, vs2005
        self.message_format_key = OptionKey(
            "message_format", machine=self.for_machine, lang=self.language
        )
        self.message_format_options = coredata.UserComboOption(
            "specify output style for messages.",
            ["antlr", "gnu", "vs2005"],
            "antlr",
        )

        # -long-messages      show exception details when available for errors and warnings
        self.long_messages_key = OptionKey(
            "long_messages", machine=self.for_machine, lang=self.language
        )
        self.long_messages_options = coredata.UserBooleanOption(
            "Show exception details when available for errors and warnings.",
            False,
        )

        # -listener           generate parse tree listener (default)
        self.generate_listener_key = OptionKey(
            "generate_listener", machine=self.for_machine, lang=self.language
        )
        self.generate_listener_options = coredata.UserBooleanOption(
            "Generate parse tree listener.",
            True,
        )

        # # -no-listener        don't generate parse tree listener
        # case_insensitive_key = OptionKey('caseInsensitive', machine=self.for_machine, lang=self.language)
        # caseInsensitive_options = coredata.UserBooleanOption(
        #     'Use case-insensitive lexing; better specified as an in-file grammar option.',
        #     False,
        # )

        # -visitor            generate parse tree visitor
        self.generate_visitor_key = OptionKey(
            "generate_visitor", machine=self.for_machine, lang=self.language
        )
        self.generate_visitor_options = coredata.UserBooleanOption(
            "Generate parse tree visitor.",
            False,
        )

        # # -no-visitor         don't generate parse tree visitor (default)
        # case_insensitive_key = OptionKey('caseInsensitive', machine=self.for_machine, lang=self.language)
        # caseInsensitive_options = coredata.UserBooleanOption(
        #     'Use case-insensitive lexing; better specified as an in-file grammar option.',
        #     False,
        # )

        # -package ___        specify a package/namespace for the generated code
        self.package_key = OptionKey(
            "package", machine=self.for_machine, lang=self.language
        )
        self.package_options = coredata.UserStringOption(
            "Specify a package/namespace for the generated code.",
            "",
        )

        # -depend             generate file dependencies
        self.depend_key = OptionKey(
            "depend", machine=self.for_machine, lang=self.language
        )
        self.depend_options = coredata.UserBooleanOption(
            "Generate file dependencies.",
            False,
        )

        # -Werror             treat warnings as errors
        self.warnings_are_errors_key = OptionKey(
            "warnings_are_errors", machine=self.for_machine, lang=self.language
        )
        self.warnings_are_errors_options = coredata.UserBooleanOption(
            "Treat warnings as errors.",
            False,
        )

        # -XdbgST             launch StringTemplate visualizer on generated code
        self.debug_string_template_visualizer_key = OptionKey(
            "XdbgST", machine=self.for_machine, lang=self.language
        )
        # -debug FIXME required when it shouldn't be.
        self.debug_key = OptionKey(
            "debug", machine=self.for_machine, lang=self.language
        )
        self.debug_string_template_visualizer_options = coredata.UserBooleanOption(
            "Launch StringTemplate visualizer on generated code.",
            False,
        )

        # -XdbgSTWait         wait for STViz to close before continuing
        self.debug_string_template_visualizer_wait_key = OptionKey(
            "XdbgSTWait", machine=self.for_machine, lang=self.language
        )
        self.debug_string_template_visualizer_wait_options = coredata.UserBooleanOption(
            "Wait for STViz to close before continuing.",
            False,
        )

        # -Xforce-atn         use the ATN simulator for all predictions
        self.x_force_atn_key = OptionKey(
            "x_force_atn", machine=self.for_machine, lang=self.language
        )
        self.x_force_atn_options = coredata.UserBooleanOption(
            "Use the ATN simulator for all predictions.",
            False,
        )

        # -Xlog               dump lots of logging info to antlr-timestamp.log
        self.x_log_key = OptionKey("Xlog", machine=self.for_machine, lang=self.language)
        self.x_log_options = coredata.UserBooleanOption(
            "Dump lots of logging info to antlr-timestamp.log.",
            False,
        )

        # -Xexact-output-dir  all output goes into -o dir regardless of paths/package
        self.x_exact_output_dir_key = OptionKey(
            "Xexact-output-dir", machine=self.for_machine, lang=self.language
        )
        self.x_exact_output_dir_options = coredata.UserBooleanOption(
            "All output goes into -o dir regardless of paths/package.",
            False,
        )

    def needs_static_linker(self) -> bool:
        # We transpile into C, so we don't need any linker
        return False

    def get_always_args(self) -> T.List[str]:
        return []

    def get_werror_args(self) -> T.List[str]:
        # -Werror             treat warnings as errors
        return ["-Werror"]

    def get_output_args(self, outputname: str) -> T.List[str]:
        # -o ___              specify output directory where all output is generated
        # TODO: -Xexact-output-dir  all output goes into -o dir regardless of paths/package
        return ["-o", outputname]

    def get_optimization_args(self, optimization_level: str) -> T.List[str]:
        # Antlr4 doesn't have optimization levels itself, the underlying
        # compiler might though
        return []

    def sanity_check(self, work_dir: str, environment: "Environment") -> None:
        code = """
            /*
             [The "BSD licence"]
             Copyright (c) 2013 Tom Everett
             All rights reserved.
             Redistribution and use in source and binary forms, with or without
             modification, are permitted provided that the following conditions
             are met:
             1. Redistributions of source code must retain the above copyright
                notice, this list of conditions and the following disclaimer.
             2. Redistributions in binary form must reproduce the above copyright
                notice, this list of conditions and the following disclaimer in the
                documentation and/or other materials provided with the distribution.
             3. The name of the author may not be used to endorse or promote products
                derived from this software without specific prior written permission.
             THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
             IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
             OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
             IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
             INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
             NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
             DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
             THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
             (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
             THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
            */

            grammar testfile;

            rulelist
                : rule_* EOF
            ;

            rule_
                : lhs ASSIGN rhs
                ;

            lhs
                : id_
                ;

            rhs
                : alternatives
                ;

            alternatives
                : alternative (BAR alternative)*
                ;

            alternative
                : element*
                ;

            element
                : optional_
                | zeroormore
                | oneormore
                | text_
                | id_
                ;

            optional_
                : REND alternatives LEND
                ;

            zeroormore
                : RBRACE alternatives LBRACE
                ;

            oneormore
                : RPAREN alternatives LPAREN
                ;

            text_
                : ID
                ;

            id_
                : LT ruleid GT
                ;

            ruleid
                : ID
                ;

            ASSIGN
                : '::='
                ;

            LPAREN
                : ')'
                ;

            RPAREN
                : '('
                ;

            LBRACE
                : '}'
                ;

            RBRACE
                : '{'
                ;

            LEND
                : ']'
                ;

            REND
                : '['
                ;

            BAR
                : '|'
                ;

            GT
                : '>'
                ;

            LT
                : '<'
                ;

            ID
                : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'-'|' ')+
                ;

            WS
                : [ \\r\\n\\t] -> skip
                ;
        """
        with self.cached_compile(code, environment.coredata) as p:
            if p.returncode != 0:
                raise EnvironmentException(
                    f"Antlr4 transpiler {self.id!r} cannot transpile grammars"
                )

    def get_buildtype_args(self, buildtype: str) -> T.List[str]:
        return antlr4_buildtype_args[buildtype]

    def get_pic_args(self) -> T.List[str]:
        # We can lie here, it's fine
        return []

    def compute_parameters_with_absolute_paths(
        self, parameter_list: T.List[str], build_dir: str
    ) -> T.List[str]:
        new: T.List[str] = []
        for i in parameter_list:
            new.append(i)

        return new

    def get_options(self) -> "MutableKeyedOptionDictType":
        """
        Set up the CLI args available
        """
        opts = super().get_options()
        opts.update(
            {
                self.language_key: self.language_options,
                self.super_class_key: self.superClass_options,
                self.token_vocab_key: self.tokenVocab_options,
                self.token_label_type_key: self.TokenLabelType_options,
                self.context_super_class_key: self.contextSuperClass_options,
                self.case_insensitive_key: self.caseInsensitive_options,
                self.lib_key: self.lib_options,
                self.atn_key: self.atn_options,
                self.encoding_key: self.encoding_options,
                self.message_format_key: self.message_format_options,
                self.long_messages_key: self.long_messages_options,
                self.generate_listener_key: self.generate_listener_options,
                self.generate_visitor_key: self.generate_visitor_options,
                self.package_key: self.package_options,
                self.depend_key: self.depend_options,
                self.debug_string_template_visualizer_key: self.debug_string_template_visualizer_options,
                self.debug_string_template_visualizer_wait_key: self.debug_string_template_visualizer_wait_options,
                self.x_force_atn_key: self.x_force_atn_options,
                self.x_log_key: self.x_log_options,
                self.x_exact_output_dir_key: self.x_exact_output_dir_options,
                self.debug_key: self.debug_string_template_visualizer_options, # dead line to try and get to running tests FIXME
            }
        )
        return opts

    def get_option_compile_args(self, options: "KeyedOptionDictType") -> T.List[str]:
        """
        Translate recieved CLI options to an array which is converted to a CLI
        invocation string
        """
        args: T.List[str] = []

        args.append(f"-Dlanguage={options[self.language_key].value}")

        tmp = options[self.super_class_key].value
        if tmp:
            args.append(f"-DsuperClass={tmp}")

        tmp = options[self.token_vocab_key].value
        if tmp:
            args.append(f"-DtokenVocab={tmp}")

        tmp = options[self.token_label_type_key].value
        if tmp:
            args.append(f"-DTokenLabelType={tmp}")

        tmp = options[self.context_super_class_key].value
        if tmp:
            args.append(f"-DcontextSuperClass={tmp}")

        tmp = options[self.case_insensitive_key].value
        if tmp:
            args.append(f"-DcaseInsensitive={tmp}")

        tmp = options[self.lib_key].value
        if tmp:
            args.extend(["-lib", tmp])

        tmp = options[self.atn_key].value
        if tmp:
            args.append(f"-atn")

        tmp = options[self.encoding_key].value
        if tmp:
            args.extend(["-encoding", tmp])

        tmp = options[self.message_format_key].value
        if tmp:
            args.extend(["-message-format", tmp])

        if options[self.long_messages_key].value:
            args.append("-long-messages")

        tmp = options[self.generate_listener_key].value
        if not tmp:
            args.append("-no-listener")

        tmp = options[self.generate_visitor_key].value
        if tmp:
            args.append("-visitor")

        tmp = options[self.package_key].value
        if tmp:
            args.extend(["-package", tmp])

        if options[self.depend_key].value:
            args.append("-depend")

        # FIXME: re-enable
        # if options[self.warnings_are_errors_key].value:
            # args.append("-Werror")

        if options[self.debug_string_template_visualizer_key].value:
            args.append("-XdbgST")

        if options[self.debug_string_template_visualizer_wait_key].value:
            args.append("-XdbgSTWait")

        if options[self.x_force_atn_key].value:
            args.append("-Xforce-atn")

        if options[self.x_log_key].value:
            args.append("-Xlog")

        if options[self.x_exact_output_dir_key].value:
            args.append("-Xexact-output-dir")

        return args


# Not sure about these functions.
# In particular, the compilers parent class referrs to a 'linker' and this
# isn't a useful concept in Antlr4.

    def get_linker_exelist(self) -> T.List[str]:
        return []

    def can_linker_accept_rsp(self) -> bool:
        """
        Determines whether the linker can accept arguments using the @rsp syntax.
        """
        return False

    def get_linker_output_args(self, outputname: str) -> T.List[str]:
        return self.get_output_args(outputname)
