# JavaDoc練習

## 1.JavaDocについて
JavaDocとはJavaのドキュメンテーションコメントのフォーマットです。  
ドキュメンテーションコメントは APIの仕様であり、APIを使用する人のための記述します。
記述しないということはチームのメンバーに対して優しくないです。

ドキュメンテーションコメントは **読んだだけでAPIが正しく使える** ように書いてあげる必要があります。
ある API を使おうと思った時に、
そのメソッドの実装を見なければ呼び出し方が分からないようであれば、
正しく説明ができていないということです。

これからクラス、メソッド、フィールドを作る際、
必ずJavaDocを書きドキュメントとして残すように意識していきましょう。

## 2. JavaDocの生成

1. このリポジトリをクローンもしくはダウンロードしてください。
1. ※ ダウンロードした場合はzipファイルなので回答してください。
1. プロジェクトのディレクトリに移動します。
1. 以下のコマンドを実行してください
    
    ``` sh
    mvn javadoc:javadoc
    ```

1. /target/site/の中にあるindex.htmlを開いてください。

# JavaDocで気を付けること

## 誰がどのタイミングで書くのか

実装者がドキュメンテーションコメントを書くべきです。
メソッドを実装する前に書くことが大切です。
後からドキュメンテーションコメントを書く姿勢はよろしくないですし、
書かないこ問題が発生する原因です。
(忘れるやめんどくさいなどの言い訳の発生原因) -> ドキュメンテーションコメントがないチームの完成します。# JavaDoc練習

## 1.JavaDocについて
JavaDocとはJavaのドキュメンテーションコメントのフォーマットです。  
ドキュメンテーションコメントは APIの仕様であり、APIを使用する人のための記述します。
記述しないことはチームのメンバーに対して優しくないです

ドキュメンテーションコメントは読んだだけでAPIが正しく使えるように書いてあげる必要があります。
ある API を使おうと思った時に、
そのメソッドの実装を見なければ呼び出し方が分からないようであれば、
正しく説明ができていないということです。

これからクラス、メソッド、フィールドを作る際、
必ずJavaDocを書きドキュメントとして残すように意識していきましょう。

## 2. JavaDocの生成

1. このリポジトリをクローンもしくはダウンロードしてください。
2. ※ ダウンロードした場合はzipファイルなので回答してくさい
3. プロジェクトのディレクトリに移動します。
4. 

``` sh
mvn javadoc:javadoc
```