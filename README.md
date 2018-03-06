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
## JAVA
* 
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
        뷰가 추가되는 방향을 값으로 지정,기본값은 가로방향 

            -vertical
            -horiznotal
        ``` 
        ```
        * android:gravity
        뷰의 내용을 뷰 영역 내에서 어디에 나타낼지 값으로 지정

        * android:Layout_gravity
        LinearLayout영역 내에서 어디에 나타낼지 값으로 지정

            -left
            -right
            -top
            -bottom
        ```   
        ```
        * android:weight
        각 뷰의 값을 기준으로 %개념으로 확장되 여백을 차지하게 되는 속성 

            -각뷰가 차지하는 면적에 맞게 상대적인 숫자를 값으로 줌

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

            -상대성의 의미를 부여할 다른 View의 id 이름을 값으로 줌 (그 View를 기준으로 현재의 View위치가 결정)
        ```
        ```
        * android:layout_alignTop
        * android:layout_alignBottom
        * android:layout_alignLeft
        * android:layout_alignRight
        * android:layout_alignBaseline
        
            -현재의 View와 변의 시작점을 맞추고 싶은 다른 View의 id 이름을 값으로 줌
        ```
        ```
        * android:layout_alignParentTop
        부모의 윗부분에 뷰의 상단을 위치

        * android:layout_alignParentBottom
        부모의 아랫부분에 뷰의 하단을 위치 

        * android:layout_alignParentLeft
        부모의 왼쪽에 뷰의 왼쪽을 위치

        * android:layout_alignParentRight
        부모의 오른쪽의 뷰의 오른쪽을 위치

        * android:layout_alignParentHorizontal
        부모의 가로방향 중앙에 뷰를 배치

        * android:layout_alignParentVertical
        부모의 세로 방향 중앙에 뷰를 위치

        * android:layout_alignParent
        부모의 가로세로 중앙에 뷰를 위치

        안드로이드의 스마트폰은 너무 다양하므로 margin과같은 속성을 쓰면 어떤 기기에서는 원하지 않는 다인이 나올 수 있으므로 부모 뷰를 이용한다.

            -true
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
        * 별도로 행을 표현하지 않아도 자동으로 개행한다. (갤러리의 구조)

    * GridLayout의 속성 및 값
        ```
        * android:orientation
        뷰가 추가되는 방향을 값으로 지정,기본값은 가로방향

            -vertical
            -horizontal
        ```
        ```
        * android:columnCount
        orientation이 가로방향일 때 한줄에 몇개의 뷰를 나열할 건지 값 숫자로 지정
        
        * android:rowCount
        orientation이 세로방향일 때 한줄에 몇개의 뷰를 나열할 건지 값 숫자로 지정
        ```
        ```
        * android:layout_column 
        뷰가 위치할 열 인덱스 지정

        * android:layout_row
        뷰가 위치할 행 인덱스 지정
        ```
        ```
        * android:layout_columnSpan
        가로방향으로 여러열을 하나의 뷰가 차지하고자 할 때

        * android:layout_rowSpan
        세로방향으로 여러행을 하나의 뷰가 차지하고자 할 때
        ```
        ```
        * android:layout_gravity
        span으로 확장된 영역 전체를 차지하게 나오게 할 때

            -fill
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
        해당 뷰의 X변에 맞다도록 상대 뷰의 Y쪽에 위치하도록 한다.

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
        가로 치우침 조절

        * app:layout_constraintvertical_bias
        세로 치우침 조절

            - 소수점을 값으로 준다
        ```
        ```
        * android:layout_marginLeft
        * android:layout_marginRight
        * android:layout_marginTop
        * android:layout_marginBottom
        * android:layout_marginStart
        * android:layout_marginEnd
        뷰와 뷰 사이의 간격을 표현하기 위한 속성 margin

            -  X dp , X px 등 의 margin값 
        ```
        ```
        * app:layout_goneMarginLeft
        * app:layout_goneMarginRight
        * app:layout_goneMarginTop
        * app:layout_goneMarginBottom
        * app:layout_goneMarginStart
        * app:layout_goneMarginEnd
        상대 뷰가 gone 상태일 때 margin값을 다르게 설정하여 상대 뷰가 보이지 않는 상황에 대응 할 수 있다.

            -  X dp , X px 등 의 margin값
        ```
        ```
        * app:layout_constraintDimensionRatio
        다른 constraint속성이 함께 지정된 경우에만 사용가능 , layout_width나 layout_height 중 하나 이상이 "0dp"일 경우만 사용가능

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
    다음의 아이디 값은 변경 할 수 없다.
    
        1. TabWidget의 id값: android:id="@android:id/tabs"
        2. FrameLayout의 id값: android:id="@android:id/tabcontent"
    
    * TabHost 사용 TIP
> 자바 코드에서 탭 버튼과 클릭했을 때의 화면은 하나의 TabSpec으로 결합되어 다룬다.   

> "@+id/name"은 id값을 앱의 R.java파일에 등록하여 이용하겠다는 의미이고, "@android:id/tabs"는 안드로이드 라이브러이의 R.java파일에 등록된 것을 이용하겠다는 의미이다.
***
### Alert
1. 토스트(Toast)

    * 토스트 기본함수   
    세번째 매개변수는 LENGTH_SHORT(3초) 또는 LENGTH_LONG(5초)만 지정할 수 있으며 임의의 숫자값을 지정할 수 없다.

        * makeText(Context context,int resId,int duration)
        * makeText(Context context,CharSequence text,int duration)       
        ```java
        * 예시

            Toast t Toast.makeText(this,"hi",Toast.LENGTH_SHORT);

            t.show(); 
        ```
    * 토스트 추가 설정 함수

        * setDuration(int duration)
        토스트가 보이는 시간 설정

        * setText(int resId)
        원하는 글을 토스트로 띄우기

        * setView(View view)
        원하는 뷰를 토스트로 띄우기

        * setGravity(int gravity,int xOffset,int yOffset)
        토스트 위치조절 가능

        * setMargin(float horizontalMargin,float verticalMargin)
        토스트 위치조절 가능

2. 알림창(AlertDialog)
3. 목록(AlertDialog)
4. 커스텀  다이얼로그(AlertDialog)
5. 프로그래스 다이얼로그(ProgressDialog)\
6. 날짜 선택(DatePickerDialog)
7. 시간 선택(TimePickerDialog)
8. 진동(vibrate)
    
    * 주의 사항   
    Permission을 설정하지 않으면 진동이 울리는 순간 오류가 발생하여 앱이 자동으로 종료된다.
        ```
        * Permission의 뜻
            - 허가
        ```
        ```JAVA
        * 퍼미션 설정하기 
            - AndroidManifest.xml에서 설정
            <uses-permission/*스페이스*/android:name="android.permissoin.VIBRATE"/>
        ```    
    * JAVA 코드   

        ```java
        * 진동 울리기   
        virbrate()의 매개변수는 진동이 울리는 시간이다. 1000으로 설정하면 1초 동안 울리는 것.

            Vibrator vid =(Vibrator)getSystemService(VIBRATOR_SERVICE);
            
            vir.vibrate(1000);
        ```
        ```java
        * 다양하게 진동 울리기

        long[]의 배열에서 홀수번째 값은 대기시간, 짝수번째 값은 진동이 울리는 시간이다.

        두 번째 매개변수에는 진동울리기 반복 횟수 값을 주면 되는데 '0'을 주면 코드에서 cancel할 때 까지 무한반복 진동하고, '-1'로 주면 한번만 진동한다.

            Vibrator vib=(Vibrator)getSystemService(VIBRATOR_SERVICE);

            vib.vibrate(new long[]{500,1000,500,1000},-1);
        ```
 
9. 소리(Ringtone)

    * 스마트폰에 내장되 효과음 사용하기   

    효과음은 RingtoneManager의 getDefaultUri()함수를 이용하여 획득한다.    

    NOTIFICATION뿐 아니라, ALATM, RINGTONE등 이 있다.

        ```java
        Uri notification =RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        Ringtone ringtone =RingtoneManager.getRingtone(getApplicationContext(),notification);

        ringtone.paly();
        ```
    * 개발자가 사용하고 싶은 효과음 사용하기
    res하위의 raw폴더를 이용해야 한다.

        ```java
        MadiaPlayer player= MediaPlayer.create(this,R.raw.fallbacking);

        player.start();
        ```
***
JAVA   
1. 
    SystemService를 이용 할 때는 시작 작업없이 getSystemService()함수로 획득하여 이용가능 하다.
*** 
***
***
