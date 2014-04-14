import AssemblyKeys._

assemblySettings

outputPath in assembly := new File("target/$name;format="Camel"$-0.0.1-SNAPSHOT-jar-with-dependencies.jar")
