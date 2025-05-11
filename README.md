This project is for reporting a bug in `ContentEncodingSupport` in Scalatra 3.1.2.

If you change `ScalatraVersion` in build.sbt to 3.1.2, it will not work correctly, but it will work correctly with 3.1.1.

You can check the operation by opening http://localhost:8080/test.txt .
The error message `HTTP ERROR 500 Insufficient content written 35 < 72` will be displayed.
