# 圆角组件 与渐变组件
1. 为什么要写这个组件？
2. android 设置selector drawable写烦了,业务太多而不统一，背景圆角度都不一样
3. 市面上大部分圆角组件都是用canvase重绘制,会破坏原有的selector drawable特性
4. 遇到一个奇葩的设计师 什么组件背景都是各种渐变色且不统一
# 增加自定义属性
1. app:radius="8dp"
2. app:radius="360dp" 为圆形

# 控件支持
1. XXFCompatButton
2. XXFCompatCheckedTextView
3. XXFCompatEditText
4. XXFCompatImageView
5. XXFCompatTextView
6. XXFFrameLayout
7. XXFLinearLayout
8. XXFRelativeLayout

## 带圆角 带渐变背景的组件
XXFGradientCompatButton
XXFGradientCompatCheckedTextView
XXFGradientCompatEditText
XXFGradientCompatImageView
XXFGradientCompatTextView
XXFGradientFrameLayout
XXFGradientLinearLayout
XXFGradientRelativeLayout

### 带圆角支持日夜间模式
XXFSkinCompatButton
XXFSkinCompatCheckedTextView
XXFSkinCompatEditText
XXFSkinCompatImageView
XXFSkinCompatTextView
XXFSkinFrameLayout
XXFSkinLinearLayout
XXFSkinRelativeLayout


# 依赖
1.    implementation 'androidx.appcompat:appcompat:1.1.0'
2. 	  implementation 'com.github.NBXXF:round_components:x.x.x'

# 如果想使用skin 换肤
1.    implementation 'androidx.appcompat:appcompat:1.1.0'
2.    implementation'skin.support:skin-support:4.0.5'                   // skin-support
3.    implementation 'skin.support:skin-support-appcompat:4.0.5'         // skin-support 基础控件支持

#用法 参考demo
``` 
  <com.xxf.roundcomponent.XXFCompatTextView
        android:id="@+id/btn_1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:background="#ff00ff"
        android:padding="10dp"
        android:text="CompatTextView"
        android:textColor="@color/test"
        app:radius="8dp" />
```

``` 
<com.xxf.gradient.XXFGradientCompatButton
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="测试"
        android:textColor="@android:color/white"
        app:end_color="@android:color/holo_blue_bright"
        app:orientation="TOP_BOTTOM"
        app:radius="4dp"
        app:start_color="#00ff00" />
``` 