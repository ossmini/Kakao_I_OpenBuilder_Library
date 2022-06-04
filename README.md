# Kakao I OpenBuilder Java Library
[![example workflow](https://github.com/Sejong-OSS/Kakao_I_OpenBuilder_Library/actions/workflows/build.yml/badge.svg)](https://github.com/Sejong-OSS/Kakao_I_OpenBuilder_Library/actions/workflows/build.yml) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Sejong-OSS_Kakao_I_OpenBuilder_Library&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Sejong-OSS_Kakao_I_OpenBuilder_Library) [![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Sejong-OSS_Kakao_I_OpenBuilder_Library&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Sejong-OSS_Kakao_I_OpenBuilder_Library) [![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=Sejong-OSS_Kakao_I_OpenBuilder_Library&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=Sejong-OSS_Kakao_I_OpenBuilder_Library) [![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=Sejong-OSS_Kakao_I_OpenBuilder_Library&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=Sejong-OSS_Kakao_I_OpenBuilder_Library)

## Getting Started
### Maven
```xml
<dependency>
  <groupId>dev.mini</groupId>
  <artifactId>kakao-i-openbuilder</artifactId>
  <version>1.0.2</version>
</dependency>
```
### Gradle
```groovy
implementation 'dev.mini:kakao-i-openbuilder:1.0.2'
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
Skill |  Supported
-- | -- 
QuickReply | X
SimpleText | O
SimpleImage | O
BasicCard | O
CommerceCard | X
ListCard | X
ItemCard | X
Thumbnail | O
Button | O
Forwardable | O
CarouselHeader | O
Profile | O
Link | O
</td>
</tr>
</table>

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
