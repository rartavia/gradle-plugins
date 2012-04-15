~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Gradle plugins
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


["xmlbeansPlugin"](https://github.com/rartavia/gradle-plugins/tree/master/xmlbeansPlugin)
========================================================================================

    apply from: 'https://raw.github.com/rartavia/gradle-plugins/master/xmlbeansPlugin/xmlbeans.gradle'

    ...

    configurations {
        xmlbeans
	}

	dependencies {
        xmlbeans 'org.apache.xmlbeans:xmlbeans:2.5.0'
	}

    sourceSets {
        schemas {
                srcDir = 'src/main/schemas'
        }
	}

Instructions:
1. Place your schemas somewhere in your project as shown above
2. Declare the required XMLBeans dependency
3. Invoke the "compileXmlSchemas" task

Notes:
Compiled classes are inside of "build/classes/xmlbeans"

See [gradle-plugins/xmlbeansPlugin/sample](https://github.com/rartavia/gradle-plugins/tree/master/xmlbeansPlugin/sample).
