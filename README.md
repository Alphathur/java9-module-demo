# java9-module-demo
Java 9 demo for modules, here are three modules in this project, a base module called api to define interface, the interface implemented by provider module, and consumed by consumer module
## directory struct
```shell script
├─.idea
│  └─inspectionProfiles
├─api
│  └─src
│      └─com
│          └─calculate
├─consumer
│  └─src
│      └─com
│          └─consumer
├─out
│  └─production
│      ├─api
│      │  └─com
│      │      └─calculate
│      ├─consumer
│      │  └─com
│      │      └─consumer
│      ├─module-demo
│      │  └─META-INF
│      └─provider
│          └─com
│              └─provider
│                  └─other
└─provider
    └─src
        └─com
            └─provider
                └─other
```
