package(default_visibility = ["//visibility:public"])

load("@io_bazel_rules_scala//scala:scala_toolchain.bzl", "scala_toolchain")

scala_toolchain(
    name = "scala_toolchain_impl",

    dependency_mode = "transitive",
    strict_deps_mode = "off",
    unused_dependency_checker_mode = "error",
    dependency_tracking_method = "ast",
)

toolchain(
    name = "scala_toolchain",
    toolchain_type = "@io_bazel_rules_scala//scala:toolchain_type",
    toolchain = "scala_toolchain_impl",
)

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary", "scala_library", "scala_test")

scala_binary(
    name = "test",
    srcs = [
        "Main.scala",
    ],
    main_class = "test.Main",
    deps = [
        "@maven//:com_softwaremill_macwire_macros_2_11",
    ],
)

