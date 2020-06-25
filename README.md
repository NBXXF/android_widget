# 圆角组件
1. 为什么要写这个组件？
2. android 设置selector drawable写烦了,业务太多而不统一，背景圆角度都不一样
3. 市面上大部分圆角组件都是用canvase重绘制,会破坏原有的selector drawable特性
# 增加自定义属性
1. app:radius="8dp"
2. app:radius="360dp" 为圆形

# 控件支持
1.TextView
2.CheckedTextView
3.AppCompatTextView
4.button
5.AppCompatButton
6.ImageView
7.AppComponentImageView
8.LinearLayout
9.ReleativeLayout
10.FrameLayout

# 依赖
1.    implementation 'androidx.appcompat:appcompat:1.1.0'
2. 	  implementation 'com.github.NBXXF:round_components:x.x.x'
