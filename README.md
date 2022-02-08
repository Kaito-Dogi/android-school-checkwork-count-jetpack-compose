# チェックワーク 〜カウントアプリをJetpack Composeで実装してみよう〜

## アプリのキャプチャ

https://user-images.githubusercontent.com/49048577/152069682-ec97f2db-9f90-41e8-9aa0-aae72c666245.mp4

## 手順

1. Jetpack Composeツールキットの依存関係を、 `build.gradle` に追加しよう
1. `setContentView` メソッドを削除して、 `setContent` ブロックを追加しよう
1. `Column` ブロックに `Text` と `Button` を追加して、それらを垂直方向に並べよう
1. `Column` ブロックを、コンポーズ可能な関数 `Counter` にまとめよう
1. `remember` を使用して、整数を管理するための `MutableState` オブジェクトを宣言しよう
1. `Button` の `onClick` の引数に、 `Button` を押すたびに `MutableState` オブジェクトの値を1増やす処理を渡そう
1. `Counter` コンポーザブルをステートレスにするために、状態をホイスティングしてみよう
1. `rememberSaveable` を使用して、アクティビティを再作成した後にUIの状態を復元できるようにしてみよう

## ヒント

- 依存関係の追加
  - [新しくプロジェクトを作成する場合](https://developer.android.com/jetpack/compose/setup?hl=ja)
  - [既存のプロジェクトにJetpack Composeを追加する場合](https://developer.android.com/jetpack/compose/interop/adding?hl=ja)
- [テキスト](https://developer.android.com/jetpack/compose/text?hl=ja)（ `Text` ）
- [マテリアルコンポーネント](https://developer.android.com/jetpack/compose/layouts/material)（ `Button` ）
- [レイアウト](https://developer.android.com/jetpack/compose/layouts/basics?hl=ja)（ `Column` ）
- [状態の管理](https://developer.android.com/jetpack/compose/state?hl=ja)（ `remember` ，状態ホイスティング， `rememberSaveable`）
