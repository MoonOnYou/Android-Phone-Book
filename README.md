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
***
_Main text_
***
***
## Layout
1. LinearLayout
    * LinearLayout의 속성 및 값
        ```
        * orientation
        뷰가 추가되는 방향을 값으로 지정,기본값은 가로방향 

            -vertical
            -horiznotal
        ``` 
        ```
        * gravity
        뷰의 내용을 뷰 영역 내에서 어디에 나타낼지 값으로 지정

        * Layout_gravity
        LinearLayout영역 내에서 어디에 나타낼지 값으로 지정

            -left
            -right
            -top
            -bottom
        ```   
        ```
        * weight
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
    * FrameLayout의 속성 및 값
4. TableLayout
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
        * orientation
        뷰가 추가되는 방향을 값으로 지정,기본값은 가로방향

            -vertical
            -horizontal
        ```
        ```
        * columnCount
        orientation이 가로방향일 때 한줄에 몇개의 뷰를 나열할 건지 값 숫자로 지정
        
        * rowCount
        orientation이 세로방향일 때 한줄에 몇개의 뷰를 나열할 건지 값 숫자로 지정
        ```
        ```
        * layout_column 
        뷰가 위치할 열 인덱스 지정

        * layout_row
        뷰가 위치할 행 인덱스 지정
        ```
        ```
        * layout_columnSpan
        가로방향으로 여러열을 하나의 뷰가 차지하고자 할 때

        * layout_rowSpan
        세로방향으로 여러행을 하나의 뷰가 차지하고자 할 때
        ```
        ```
        * layout_gravity
        span으로 확장된 영역 전체를 차지하게 나오게 할 때

            -fill
        ```
    * GridLayout 사용 TIP
> LinearLayout 과 GridLayout만 방향을 지정하는 orientation속성을 제공한다.

> orientation이 horizontal이면 columnCount만 의미가 있고 ,vertical이면 rowCount만 의미가 있다.
6. ConstrainLayout
    * ConstrainLayout의 속성 및 값
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
2. 알림창(AlertDialog)
3. 목록(AlertDialog)
4. 커스텀  다이얼로그(AlertDialog)
5. 프로그래스 다이얼로그(ProgressDialog)\
6. 날짜 선택(DatePickerDialog)
7. 시간 선택(TimePickerDialog)
8. 진동(vibrate)
9. 소리(Ringtone)
*** 
***
***
