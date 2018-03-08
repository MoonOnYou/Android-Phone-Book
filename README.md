***
***
***
# android
***
***
_List_
***
***
## Layout
1. LinearLayout
2. RelativeLayout
3. FrameLayout
4. TableLayout
5. GridLayout
6. ConstrainLayout
7. TabHost 
***
## Resource
1. 애니매이션(Animation) 리소스
2. 크기와 색상 리소스
3. 스타일 ,테마 리소스
***
## Alert
1. 토스트(Toast)
2. 알림창(AlertDialog)
3. 목록(AlertDialog)
4. 커스텀  다이얼로그(AlertDialog)
5. 프로그래스 다이얼로그(ProgressDialog)
6. 날짜 선택(DatePickerDialog)
7. 시간 선택(TimePickerDialog)
8. 진동(vibrate)
9. 소리(Ringtone) 
***
## 사용자 이벤트 처리
1. 델리게이션 이벤트 모델 (Delegation Event Model)
2. 하이어라키 이벤트 모델 (Hierarchy Event Model)
***
## JAVA
***
***
_Main text_
***
***
## Layout
1. LinearLayout
    * Linear의 사전적 의미   

        * 선의, 직선의, 선 모양의, 일직선으로 늘어선
        * 1차원의, 길이와 관계하는
        * 실 모양의

    * LinearLayout의 속성 및 값
        ```
        * android:orientation
        | 뷰가 추가되는 방향을 값으로 지정,기본값은 가로방향 

            - vertical
            - horiznotal
        ``` 
        ```
        * android:gravity
        | 뷰의 내용을 뷰 영역 내에서 어디에 나타낼지 값으로 지정

        * android:Layout_gravity
        | LinearLayout영역 내에서 어디에 나타낼지 값으로 지정

            - left
            - right
            - top
            - bottom
        ```   
        ```
        * android:weight
        | 각 뷰의 값을 기준으로 %개념으로 확장되 여백을 차지하게 되는 속성 

            - 각뷰가 차지하는 면적에 맞게 상대적인 숫자를 값으로 줌

        ```
    * LinearLayout 사용 TIP
        
> orientation속성이 "vertical"이면 세로 방향의 layout_gravity가 적용되지않고, "horizontal"이면 가로 방향의 layout_gravity가 적용되지 않는다.

> 단순히 View에서 gravity를 사용하는 방법 말고도, LinearLayout에 gravity를 사용 할 수 있다.

> LinearLayout 과 GridLayout만 방향을 지정하는 orientation속성을 제공한다.   
           

2. RelativeLayout
    * RelativeLayout의 속성 및 값
        ```
        * android:layout_above
        * android:layout_below
        * android:layout_toLeftOf
        * android:layout_toRightOf

            - 상대성의 의미를 부여할 다른 View의 id 이름을 값으로 줌 (그 View를 기준으로 현재의 View위치가 결정)
        ```
        ```
        * android:layout_alignTop
        * android:layout_alignBottom
        * android:layout_alignLeft
        * android:layout_alignRight
        * android:layout_alignBaseline
        
            - 현재의 View와 변의 시작점을 맞추고 싶은 다른 View의 id 이름을 값으로 줌
        ```
        ```
        * android:layout_alignParentTop
        | 부모의 윗부분에 뷰의 상단을 위치

        * android:layout_alignParentBottom
        | 부모의 아랫부분에 뷰의 하단을 위치 

        * android:layout_alignParentLeft
        | 부모의 왼쪽에 뷰의 왼쪽을 위치

        * android:layout_alignParentRight
        | 부모의 오른쪽의 뷰의 오른쪽을 위치

        * android:layout_alignParentHorizontal
        | 부모의 가로방향 중앙에 뷰를 배치

        * android:layout_alignParentVertical
        | 부모의 세로 방향 중앙에 뷰를 위치

        * android:layout_alignParent
        | 부모의 가로세로 중앙에 뷰를 위치

        | | 안드로이드의 스마트폰은 너무 다양하므로 margin과같은 속성을 쓰면 어떤 기기에서는 원하지 않는 다인이 나올 수 있으므로 부모 뷰를 이용한다.

            - true
        ```
3. FrameLayout
    * FrameLayout의 특징
        * FrameLayout은 자체의 특별한 속성이 없으며, 레이아웃에 포함된 뷰들을 같은 영역에 겹쳐서 배치할 때 사용한다.
        * 따라서 visibiliy속성이 많이 쓰인다.

4. TableLayout
    * TableLayout의 특징
        * 각각의 뷰를 테이블 구조로 나열 할 때 씀
        * 각각의 행(row)을 TableRow로 표현해 주어야함
        * 하나의 뷰가 여러 셀을 차지 할 수도 있고, 여백이 발생 할 경우 열(기둥)을 확장 시킬수도 있다.
        
    * TableLayout의 속성들과 쓰임의 예
        ```
        * android:shrinkColumns="0,1" : 화면크기를 벗어나는 경우 인덱스 0,1의 열 크기를 줄임
        * android:stretchColumns="1" : 화면여백이 발생하는 경우 인덱스 1의 열 크기를 늘림
        * android:layout_column="1" :뷰의 위치 지정, 인덱스 1의 위치에 뷰가 위치
        * android:layout_span="2" : 두개의 열을 하나의 뷰가 차지
        ```
5. GridLayout
    * GridLayout의 특징   
    |별도로 행을 표현하지 않아도 자동으로 개행한다. (갤러리의 구조)

    * GridLayout의 속성 및 값
        ```
        * android:orientation
        | 뷰가 추가되는 방향을 값으로 지정,기본값은 가로방향

            - vertical
            - horizontal
        ```
        ```
        * android:columnCount
        | orientation이 가로방향일 때 한줄에 몇개의 뷰를 나열할 건지 값 숫자로 지정
        
        * android:rowCount
        | orientation이 세로방향일 때 한줄에 몇개의 뷰를 나열할 건지 값 숫자로 지정
        ```
        ```
        * android:layout_column 
        | 뷰가 위치할 열 인덱스 지정

        * android:layout_row
        | 뷰가 위치할 행 인덱스 지정
        ```
        ```
        * android:layout_columnSpan
        | 로방향으로 여러열을 하나의 뷰가 차지하고자 할 때

        * android:layout_rowSpan
        | 세로방향으로 여러행을 하나의 뷰가 차지하고자 할 때
        ```
        ```
        * android:layout_gravity
        | span으로 확장된 영역 전체를 차지하게 나오게 할 때

            - fill
        ```
    * GridLayout 사용 TIP
> LinearLayout 과 GridLayout만 방향을 지정하는 orientation속성을 제공한다.

> orientation이 horizontal이면 columnCount만 의미가 있고 ,vertical이면 rowCount만 의미가 있다.

> TableLayout과 GridLayout 추가된 뷰의 layout_width,layout_heigth 값은 기본 wrap_content로 지정되0므로, 따로 설정하지 않아도 되지만 스마트폰의 가로크기 호환성을 위해서 layout_width를 모두 0dp로 주고, layout_weight에 따라 화면에 나오게 처리하는 것이 좋다.

6. ConstrainLayout   
    * Constraint의 사전적 의미   
        * 강제, 압박, 속박
        * 거북스러움, 어색함
        * (감정·욕망의) 억제
        * 제약, 제한

    * ConstrainLayout의 속성 및 값
        ```
        * app:layout_constraintX_Y   
        | 해당 뷰의 X변에 맞다도록 상대 뷰의 Y쪽에 위치하도록 한다.

        * app:layout_constraintLeft_toLeftOf
        * app:layout_constraintLeft_toRightOf
        * app:layout_constraintRight_toLeftOf
        * app:layout_constraintRight_toRightOf
        * app:layout_constraintTop_toTopOf
        * app:layout_constraintTop_toBottomOf
        * app:layout_constraintBottom_toTopOf
        * app:layout_constraintBottom_toBottomOf
        * app:layout_constraintStart_toStartOf
        * app:layout_constraintStart_toEndOf
        * app:layout_constraintEnd_toStarOf
        * app:layout_constraintEnd_toEndOf
        * app:layout_constraintBaseline_toBaselineOf
       
            - 상대뷰의 id
            - parent (상위 뷰)
        ```
        ```
        * app:layout_constraintHorizontal_bias
        | 가로 치우침 조절

        * app:layout_constraintvertical_bias
        | 세로 치우침 조절

            - 소수점을 값으로 준다
        ```
        ```
        * android:layout_marginLeft
        * android:layout_marginRight
        * android:layout_marginTop
        * android:layout_marginBottom
        * android:layout_marginStart
        * android:layout_marginEnd
        | 뷰와 뷰 사이의 간격을 표현하기 위한 속성 margin

            -  X dp , X px 등 의 margin값 
        ```
        ```
        * app:layout_goneMarginLeft
        * app:layout_goneMarginRight
        * app:layout_goneMarginTop
        * app:layout_goneMarginBottom
        * app:layout_goneMarginStart
        * app:layout_goneMarginEnd
        | 상대 뷰가 gone 상태일 때 margin값을 다르게 설정하여 상대 뷰가 보이지 않는 상황에 대응 할 수 있다.

            -  X dp , X px 등 의 margin값
        ```
        ```
        * app:layout_constraintDimensionRatio
        | 다른 constraint속성이 함께 지정된 경우에만 사용가능 , layout_width나 layout_height 중 하나 이상이 "0dp"일 경우만 사용가능

            - 기준 선택 (H 또는 W ) , 비율 (ex. 3:4)
        ```
    * ComstraintLayout 사용 TIP, 보충설명
> layout_constraintLeft_toLeftOf="parent"는 '뷰의 왼쪽 변을 부모의 왼쪽에 붙여라'는 뜻이고, layout_constraintRight_toRightOf="parent"는 '뷰의 오른쪽 변을 부모의 오른쪽에 붙여라'는 뜻인데 ,이 둘을 같이 사용하면 뷰는 화면 중앙에 위치하게 된다.

> app:layout_constraintHorizontal_bias ="0.2" 를 주면 왼쪽에서 20% 위치에 나타난다.

>app:layout_constraintDimensionRatio="H,3:4"의 기준은 가로이고 가로의 길이가 3일 때 세로의 길이는 4라는 것을 뜻한다.
7. TabHost

    * TabHost의 구조
        1. TabHost: 탭 전체 영역을 지칭
        2. TabWidget: 탭 버튼이 들어갈 영역을 지칭
        3. FrameLayout: 탭 버튼 클릭 시 나올 화면 영역을 지칭

    * TabHost의 id값   
    | 다음의 아이디 값은 변경 할 수 없다.
    
        1. TabWidget의 id값: android:id="@android:id/tabs"
        2. FrameLayout의 id값: android:id="@android:id/tabcontent"
    
    * TabHost 사용 TIP
> 자바 코드에서 탭 버튼과 클릭했을 때의 화면은 하나의 TabSpec으로 결합되어 다룬다.   

> "@+id/name"은 id값을 앱의 R.java파일에 등록하여 이용하겠다는 의미이고, "@android:id/tabs"는 안드로이드 라이브러이의 R.java파일에 등록된 것을 이용하겠다는 의미이다.
***
## Resource
| 안드로이드의 모든 리소스들은 모두 res폴더 하위에 있어야 하며,개발자가 임의로 폴더명을 지정 할 수 도, 만들수도 없다   
| 하위폴더에 서브폴더를 만들수도 없다.   
| 리소스를 추가하는 순간 int형의 임의 변수명으로 R.java파일에 저장된다.

* 폴더명 및 리소스
        
    * drawable :이미지,이미지와 관련된xml, 그림을 표현한xml
    * layout :화면 UI를 정의한 레이아웃xml
    * values :문자열 ,색상, 크기 등 여러가지 값
    * menu :액티비티의 메뉴를 구성하기 위한xml
    * anim :애니매이션을 위한xml
    * raw :바이트 단위로 직접 이용되는 이진 파일
    * mipmap :앱 아이콘 이미지

1. 애니매이션(Animation) 리소스
    * 애니메이션의 태그,속성과 값
        ```
        <공통속성>

        * android:duration
        | 지정한 애니매이션을 얼마동안 지속하는지에 대한 설정

            - 2000으로 설정하면 2초동안 지속됨

        * android:startOffset
        | 애니매이션을 시작한 후 얼마 후부터 애니메이션 효과를 적용할 것인지 설정

            - 500으로 지정하면 0.5초 이후 에니매이션 효과 적용
        
        * repeatCount 
        | 애니매이션 반복횟수 지정

            - infinite는 무한반복 , 정수 값
        
        * repeatMode 
        | 애니매이션 반복

            - restart 는 같은 방향 , reverse는 반대 방향
        ```
        ```
        <scale>

        * android:fromXScale
        | X축 방향 시작 배율

        * android:fromYScale
        | Y축 방향 시작배율

        * android:toXScale
        | X축 방향 끝 배율

        * android:toYScale
        | Y축 방향 끝 배율

            - 0이면 안보이고 2이면 두 배 확대

        * android:pivotX
        * android:pivotY
        ||확대 축소 기준점
            
            - 50% 지정하면 X축(또는 Y축) 중앙점
        ```
        ```
        <rotate>

        * fromDegrees
        | 회전시작 각도

        * toDegrees
        | 회전 끝 각도

        * android:pivotX
        * android:pivotY
        ||확대 축소 기준점
            
            - 50% 지정하면 X축(또는 Y축) 중앙점
        ```
        ```
        <alpha>

        * android:fromAlpha 
        | 시작 투명도

        * android:toAlpha
        | 끝 투명도
        ```
        ```
        <translate>

        * fromXDelta 
        | X축 방향 이동 시작 지점

        * fromYDelta
        | Y축 방향 이동 시작 지점

        * toXDelta
        | X축 방향 이동 끝 지점

        * toYDelta
        | Y축 방향 이동 끝 지점
        ```
    * 작성한 XML과 JAVA코드 연결하기    
    | Animation 객체로 in이라는 XML 파일을 지칭하여 뷰의 startAnimation() 함수를 이용해 적용
        ```java
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.in);
        imageView.startAnimation(anim);
        ```
2. 크기와 색상 리소스   
| values폴더에 있는 리소스들은 다른 리소스들과 다르게 파일명으로 식별 되는 것이 아니라 , 각 XML파일의 태그 이름 값으로 식별되어 사용된다.   
    
    * 권장 파일명
        ```
        * strings.xml 
        | 문자열 리소스를 여러개를 담는 파일,파일내에 <string>태그로 각 리소스 등록

        * colors.xml
        | 색상 리소스를 여러개를 담는 파일,파일내에 <color>태그로 각 리소스 등록

        * styles.xml
        | 스타일을 여러개 담는 파일,파일내에 <style>로 각 리소스 등록

        * arrays.xmml
        | 배열 리소스를 여러개 담는 파일,<string-array>,파일내에 <integer-array>태그로 각 리소스 등록

        * dimens.xml
        | 크기 리소스를 담는 파일, 파일내에 <dimen>태그로 각 리소스 등록

        || 모두 <resources> </resources> 태그 안에 넣으면 된다.
        ```
3. 스타일 리소스,테마 리소스   
| 스타일 ,테마 리소스는 values폴더 하위의 style.xml에 값을 주면 된다   
| 앱 개발시 같은 속성들을 계속 중복하게 되는데 이때 style속성을 이용하면 된다.   
| 중복되는 속성을 묶으면 스타일 리소스, 중복되는 액티비티를 묶으면 테마 리소스라 부른다.
    * 스타일 리소스 사용방법
        1. values폴더 하위에 있는 styles.xml파일에 style을 정의 한다.
            * 예시
                ```xml
                <style name="myStyle">
                    <item name="android:textColor">#F00000FF</item>
                    <item name="android:textSize">20dp</item>
                </style>
                ```
        2. view에서 style속성 사용하기 
            * 예시
                ```xml
                <TextView>
                    . . .
                    style="@style/myStyle
                />
                ```
        3. 스타일을 정의 할 떄 다른 스타일을 상속 받아 재정의 할 수도 있다.
            * 예시 
                ```xml
                <style name="myStyle">
                    <item name="android:textColor">#F00000FF</item>
                    <item name="android:textSize">20dp</item>
                </style>

                <style name="subStyle" parent="myStyle">
                    <item name="android:textStyle">italic</item>
                </style>
                ```
            
    * 테마 리소스 사용방법    
    
        1. Android의 기본 테마는 라이브러리의 테마를 상속 받은 "AppTheme"이다. style.xml에 가면 다음과 같은 코드가 기본으로 있다
            * 코드
                ```xml
                <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
                    <item name="colorPrimary">@color/colorPrimary</item>
                    <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
                    <item name="colorAccent">@color/colorAccent</item>
                </style>
                ```
            * 기본 액티비티 테마 색상
                * colorPrimaryDark : 잔여 배터리 표시가 있는 그 부분의 바 (상태바)
                    - 이 부분을 안보이게 하고 싶다면 액티비티가 이영역까지 차지하도록 하면 된다.
                        ```xml
                        <style name="myTheme" parent="Theme.AppCompat.Light.DarkActionBar">
                            <item name="windowNoTitle">true</item>
                            <item name="windowActionBar">false</item>
                            <item name="android:windowFullscreen">true</item> //이 부분이 차지하도록하는 코드
                        </style>
                        ```
                * colorPrimary : 위 바로 및의 바, 어플 이름이 나타나는 곳
                * textColorPrmary : colorPrimary에 나타나는 어플이름의 색상
                * windowBackground : 배경 색
                * navigationBarClolr : 뒤로가기,홈 등 키가 있는 곳, 맨 아래부분 바   
                   

        2. 스타일과 테마 모두 style.xml 파일에 정리하지만 스타일은 layout.xml의 각 뷰로 표현하고 , 테마는 액티비티 자체를 다루므로 AndroidManifest.xml 에 등록한다. 
            
            * 등록 예시 
                ```xml
                <application
                    android:theme="XXX">
                </application>
                ```
        3. application 태그에 적용하면 모든 액티비티가 같은 테마를 가지게 되는데 그중 다른 테마를 적용하고 싶을 때
            
            * AndroidManifest.xml의 <application> 의 하위태그 <activity>에 태마를 설정하면 된다.
                ```xml
                <activity android:name="MainActivity"
                          android:theme="@style/AppTheme">
                </acitivity>
                ```
        4. 액티비티 가로세로 고정 방법
            * 이 역시 AndroidManifest.xml파일의 <activity>태그에 설정한다.
                * android:screenOrientation
                    - landscape, 가로방향 고정
                    - portrait, 세로 방향 고정 
    

***
## Alert
1. 토스트(Toast)

    * 토스트 기본함수   
    | 세번째 매개변수는 LENGTH_SHORT(3초) 또는 LENGTH_LONG(5초)만 지정할 수 있으며 임의의 숫자값을 지정할 수 없다.

        * makeText(Context context,int resId,int duration)
        * makeText(Context context,CharSequence text,int duration)

    * 예시       
        ```java
        Toast t Toast.makeText(this,"hi",Toast.LENGTH_SHORT);

        t.show(); 
        ```
    * 토스트 추가 설정 함수

        * setDuration(int duration)   
        | 토스트가 보이는 시간 설정

        * setText(int resId)   
        | 원하는 글을 토스트로 띄우기

        * setView(View view)   
        | 원하는 뷰를 토스트로 띄우기

        * setGravity(int gravity,int xOffset,int yOffset)   
        | 토스트 위치조절 가능

        * setMargin(float horizontalMargin,float verticalMargin)   
        | 토스트 위치조절 가능

2. 알림창(AlertDialog)
3. 목록(AlertDialog)
4. 커스텀  다이얼로그(AlertDialog)
5. 프로그래스 다이얼로그(ProgressDialog)\
6. 날짜 선택(DatePickerDialog)
7. 시간 선택(TimePickerDialog)
8. 진동(vibrate)
    
    * 주의 사항   
    | Permission을 설정하지 않으면 진동이 울리는 순간 오류가 발생하여 앱이 자동으로 종료된다.

    * Permission의 뜻   
    | 허가

    * 퍼미션 설정하기   
    | AndroidManifest.xml에서 설정
        ```java
        <uses-permission android:name="android.permissoin.VIBRATE"/>
        ```           
    * 진동 울리기   
    | virbrate()의 매개변수는 진동이 울리는 시간이다.    
    | 1000으로 설정하면 1초 동안 울리는 것.
        ```java
        Vibrator vib =(Vibrator)getSystemService(VIBRATOR_SERVICE);
                    
        vir.vibrate(1000);
        ```   
    * 다양하게 진동 울리기   
    | long[]의 배열에서 홀수번째 값은 대기시간, 짝수번째 값은 진동이 울리는 시간이다.  
    | 두 번째 매개변수에는 진동울리기 반복 횟수 값을 주면 되는데 0을 주면 코드에서 cancel할 때 까지 무한반복 진동하고, -1로 주면 한번만 진동한다.   
     
        ```java
        Vibrator vib=(Vibrator)getSystemService(VIBRATOR_SERVICE);

        vib.vibrate(new long[]{500,1000,500,1000},-1);
        ``` 
9. 소리(Ringtone)

    * 스마트폰에 내장되 효과음 사용하기  
    | 효과음은 RingtoneManager의 getDefaultUri()함수를 이용하여 획득한다.    
    | NOTIFICATION뿐 아니라, ALATM, RINGTONE등 이 있다.  
        ```java
        Uri notification =RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        Ringtone ringtone =RingtoneManager.getRingtone(getApplicationContext(),notification);

        ringtone.paly();
        ```

    * 개발자가 사용하고 싶은 효과음 사용하기  
    | res하위의 raw폴더를 이용해야 한다.

        ```java
        MadiaPlayer player= MediaPlayer.create(this,R.raw.fallbacking);

        player.start();
        ```
***
## 사용자 이벤트 처리   
1. 델리게이션 이벤트 모델 (Delegation Event Model)    
| 뷰에서 발생하는 이벤트를 처리하기 위한 모델   
| 이벤트를 명료 하게 처리하기 위한 모델

    * 델리게이션 (Delegation)의 사전적 의미   
        * 대표 임명, (권력 등의) 위임   
        * 대표단,각 주(州)를 대표하는 국회의원
        * 대표 파견   
        
    * 델리게이션 이벤드 프로그램 구조
        1. 이벤트 소스(Event Source): 이벤트가 발생한 뷰 객체
        2. 이벤트 핸들러(Event Handler): 이벤트 처리 내용을 가지는 객체
        3. 리스너(Listener): 이벤트 소스와 이벤트 핸들러를 연결하는 작업
    
    | 이벤트 소스와 이벤트 핸들러를 setOnXXXListener()함수로 연결하고 이벤트 핸들러는 OnXXXListener를 구현하여 작성.

    * java코드

        1. vibrateCheckView객체에서 CheckedCahngeEvent가 발생하면 
        2. MyEventHandler클래스 객체를 실행하여 이벤트를 처리하라
        3. (MyEventHandler를 개발자 만들어야 하며, 반드시 지정된 인터페이스를 구현해야함)    
        
        ```java
        1,2번 

        vibrateCheckView.setOnCeckedChangeListener(new MyEventHandler());
        ```    
        ```java
        3번 

        class MyEventHandler implements CompoundButton.OnCheckedChangeListener{
            @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked){

            }
        }
        ```

        * 주요 이벤트
            * OnClickListener   
            | 뷰 클릭 시 발생하는 이밴트   
            모든뷰에 적용 가능하다.

            * OnLongClickListener   
            | 뷰를 오래 클릭했을 때 발생하는 이벤트   
            모든뷰에 적용 가능하다.   
            | 롱 클릭이벤트를 뷰에 적용하려면 setOnLongClickListener()메서드 이용

            * OnCheckedChangeListener   
            | CheckBox의 상태 변경 이밴트
            
            * OnItemClickListener    
            | ListView의 항목 선택 이벤트
            
            * OnDateSetListener    
            | DatePicker의 날짜 선택 이벤트
            
            * OnTimeSetListener    
            | TimePicker의 시간 선택 이벤트 
            ```java
            btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){

                }
            });
            ```
            ```java
            btn.setOnLongClickListener(new View.OnLongClickListener(){
                @Override
                public boolean onLongClick(View v){
                    return false;
                }
            });
            ```
            ```java
            checkBox.setOnCheckedChangListener(new CompoundButton.OnCheckedChangeListener(){
                @Overrid
                public void onCheckedChanged(CompoundButton buttonView,booleab isChecked){

                }
            });
            ```
2. 하이어라키 이벤트 모델 (Hierarchy Event Model)   
| 액티비티에서 발생하는 사용자의 터치나 키 이벤트를 직접 처리하기 위한 모델   
| onTouchEvent

    * 하이어라키 (Hierarchy)의 사전적 의미      
        * 계층제, 계급제   
        * 계층,분류의 체계
        * 권력자 집단,권력자 집단에 의한 통치, 엘리트   
            
    1. 터치 이벤트  
    | 사용자가 손가락으로 조작하는 일을 터치 이벤트로 처리하여 구성   
    | 사용자가 손가락을 상하좌우 중 어떤 방향으로 밀었는지 알아낼 때도 터치 이벤트를 이용     
       
        * 터치이벤트가 발생 할 때 콜백함수를 액티비티내에 정의하는 것만으로도 이벤트 처리가 가능
            ```java
            @Override
            public boolean onTouchEvent(MotionEvent event){
            return super.onTouchEvent(event);
            }
            ```
        * onTouchEvent메서드가 호출되는 터치 이벤트는 3가지 타입이 있으며, 이 메서드의 메개변수 식별해서 사용할 수 있다.

            * ACTION_DOWN :화면에 터치된 순간의 이벤트
            * ACTION_UP: 터치를 떼는 순간의 이벤트
            * ACTION_MOVE :터치한 후 이동한 순간의 이벤트

        * 터치 이벤트가 발생한 좌표값을 얻는 매서드
            ```
            * getX()
            * getY()
            | 이벤트가 발생한 뷰 내에서 좌표값을 반환한다.
            ```
            ```
            * getRawX()
            * getRawY()
            | 화면에서의 좌표값을 반환한다.
            ```
            ```java
            @Override
            public boolean onTouchEvent(MotionEvent event){
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    initX=event.getRawX();
                }
                return true;
            }
            ```
    2. 키 이벤트   
    | 주로 '뒤로가기' 버튼에서 '정말 종료 하시겠습니까?'로 사용   
    | 홈,전원,오버뷰 버튼 일반 애플리케이션에서 이벤트 처리로 제어하지 못한다.     
        * 키 이벤트가 발생할 때 호출되는 이벤트 함수를 액티비티내에 정의만 하면 된다.
            ```java
            @Override
            public boolean onKeydown(int keyCode,keyEvent event){
                return super.onKeyDown(keyCode, event);
            }
            ```
        * 키 이벤드가 발생할 때 호출되는 이벤트 함수    
        | keyCode 값이 전달되어 어느 버튼을 누른건지 식별가능

            * onKeyDown :키가 눌린순간의 이벤트   
            * onKeyUp : 키가 떼는 순간의 이벤트   
            * onKeyLongPress :이를 오래 누르는 순간의 이벤트   
            ```java
            @Override
            public boolean onKeyDown(int keyCode,keyEvent event){
                if(keyCode==keyEventKEYCODE_BACK){

                }
                return super.onKeyDown(keyCode,event);
            }
            ```
        * onKeyDown()메서드 이외의 뒤로가기 메서드 == onBackPressed()   
        | onBackPressed()뒤로가기 목적으로 만들어 졌으므로 다른 키 이벤트는 처리 할수 없다.
            ```java
            @Override
            public void onBackPressed(){
                super.onBackPressed();
            }
            ```
    * 알아두면 좋을 것
> 
***
## JAVA   

1. 
    SystemService를 이용 할 때는 시작 작업없이 getSystemService()함수로 획득하여 이용가능 하다.
2. 안드로이드 자바코드 중 "setOn###Listener()"와 같은 구문은 이벤트 소스와 이벤트 핸들러를 리스너로 연결하는 부분이다.
*** 
***
***
