- The Flutter follows Parent child hierarchy to maintain its structure

## Material App
In Flutter, `MaterialApp` is a core widget that serves as the root of a Material Design application. It is a convenience widget that wraps several other widgets commonly required for building apps that adhere to Google's Material Design guidelines.

```
import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    home: Material(
      child:Text('Hello world'),
    ),
  ));
}

```

## Stateless Widget
Used for Auto reload

A Stateless Widget in Flutter is a type of widget that does not have any mutable state. This means that once a Stateless Widget is built, its properties and appearance remain constant and cannot be changed during the application's runtime.

```
import 'package:flutter/material.dart';

void main() => runApp(MyStatelessWidget());

class MyStatelessWidget extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Material(
        child: Column(
          children: [
            Text('working Fine'),
            Text('Hello world'),
             Text('Hello world'),
          ],
        ),
      ),
    );
  }
}

```