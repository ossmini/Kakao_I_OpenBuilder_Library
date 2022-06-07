# Kakao I OpenBuilder Java Library
[![example workflow](https://github.com/Sejong-OSS/Kakao_I_OpenBuilder_Library/actions/workflows/build.yml/badge.svg)](https://github.com/Sejong-OSS/Kakao_I_OpenBuilder_Library/actions/workflows/build.yml) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Sejong-OSS_Kakao_I_OpenBuilder_Library&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Sejong-OSS_Kakao_I_OpenBuilder_Library) [![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Sejong-OSS_Kakao_I_OpenBuilder_Library&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Sejong-OSS_Kakao_I_OpenBuilder_Library) [![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=Sejong-OSS_Kakao_I_OpenBuilder_Library&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=Sejong-OSS_Kakao_I_OpenBuilder_Library) [![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=Sejong-OSS_Kakao_I_OpenBuilder_Library&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=Sejong-OSS_Kakao_I_OpenBuilder_Library)
> This library was created by an individual, not an official.  

## Getting Started
> It is currently deployed in the Github Package Registry and JitPack.  
> We recommend JitPack because Github Package Registry requires Github Token provided by the administrator.

> The Getting Started below is based on JitPack.
### Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
```xml
<dependency>
    <groupId>com.github.ossmini</groupId>
    <artifactId>Kakao_I_OpenBuilder_Library</artifactId>
    <version>Tag</version>
</dependency>
```
### Gradle
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
```gradle
implementation 'com.github.ossmini:Kakao_I_OpenBuilder_Library:Tag'
```

### Example

```java
static final String IMAGE_URL = "http://k.kakaocdn.net/dn/83BvP/bl20duRC1Q1/lj3JUcmrzC53YIjNDkqbWK/i_6piz1p.jpg";

Template template = TemplateBuilder.builder()
        .addSimpleText("Hello World")
        .addSimpleImage(IMAGE_URL, "Hello World")
        .build();

return SKillResponseBuilder.builder()
        .addTemplate(template)
        .build();
```

## Supported Skills (In progress)
| Skill | Supported |
| -- | :--: |
| QuickReply | X |
| SimpleText | O |
| SimpleImage | O |
| BasicCard | O |
| CommerceCard | X |
| ListCard | X |
| ItemCard | X |
| Thumbnail | O |
| Button | O |
| Forwardable | O |
| CarouselHeader | O |
| Profile | O |
| Link | O |

## Build
You need [Apache Maven](http://maven.apache.org/) to build the project:

```bash
mvn clean install
```

## References
- [Kakao i Developers Docs](https://i.kakao.com/docs/getting-started-overview)

## Contributing
- [Check out the CONTRIBUTING.md](https://github.com/ossmini/Kakao_I_OpenBuilder_Library/blob/develop/CONTRIBUTING.md)

## License
Licensed under the [Apache-2.0](https://github.com/ossmini/Kakao_I_OpenBuilder_Library/blob/main/LICENSE) license.
