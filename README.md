# My Plugin

## Issue

When I remove a PSI that is present in the stub index using SafeDeleteProcessor, after restarting IntelliJ the stub is
still present in the index

## (Hopefully) relevant classes

* [AssetElementType](src/main/kotlin/com/example/psi/Asset.kt): Everything related to the stubs

I also added [MonitoringAnnotator](src/main/kotlin/com/example/shaded/monitoring/MonitoringAnnotator.kt) to monitor the
current [AssetIndex](src/main/kotlin/com/example/psi/Asset.kt)

## Steps to reproduce

1. Start IntelliJ with this plugin using `gradlew runIde` and open the directory [example](example) which contains a
   test file. You should see "[AST-1, AST-2]" in the logs.
2. Remove "asset AST-2 {}" and you should see "[AST-1]" in the logs
3. Restart IntelliJ and there is "[AST-1, AST-2]" in the logs again

I expected to only see "[AST-1]" in the logs after restart.