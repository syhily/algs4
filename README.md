# algs4

The answer for Algorithms, 4th Edition

##  macOS 开发环境搭建

1. 安装 maven：`brew install maven`
2. 安装 git：`xcode-select --install`
3. 安装 JDK：https://docs.oracle.com/en/java/javase/15/install/installation-jdk-macos.html#GUID-2FE451B0-9572-4E38-A1A5-568B77B146DE
4. 安装 IntelliJ IDEA：https://www.jetbrains.com/idea/download/

##  项目初始化

1. 运行命令：`mvn archetype:generate -DgroupId=moe.yufan.study -DartifactId=algs4 -DarchetypeGroupId=org.apache.maven.archetypes` 命令中的 `moe.yufan.study` 改为自己的包名。
2. 添加 `.gitignore` 等文件。
3. 修改 `pom.xml`，增加项目开发基础包。

```xml
<dependency>
    <groupId>edu.princeton.cs</groupId>
    <artifactId>algs4</artifactId>
    <version>1.0.4</version>
</dependency>
```