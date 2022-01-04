# Tugas Besar : SnackGame

## Praktikum Pemrograman 2

<hr>

### Daftar Nama Kelompok

| No. | Nama | NIM | Kelas  |
| ----------- | ----------- | ----------- | ----------- |
| 1 | Amita Putry Prasasti | 20104014 | SE-04-A |
| 2 | Afifatunni'mah | 20104007 | SE-04-A |
| 3 | Raihan Febriyansah | 20104102 | SE-04-A |
| 4 | Wahyu Triono | 20104001 | SE-04-A |

<hr>

## Pendahuluan

+  **Pengertian SnackGame**

`SnackGame` adalah sebuah permainan ular sederhana  menggunakan bahasa pemrograman Java OOP (Object Oriented Programming). Konsep permainan ini yaitu si pemain akan mengendalikan sebuah mahluk yang menyerupai ular yang akan bergerak mengitari sebuah bidang berbentuk kotak, dengan tujuan mengambil makanan yang aslinya berbentuk dot atau titik. Selama bermain, si pemain harus berusaha untuk tidak menabrak dinding, karena setiap kali si pemain memakan makanan, ekornya akan bertambah panjang. Kontrol-pun sangat mudah, yakni hanya atas, bawah, kiri dan kanan, ular akan berjalan secara otomatis dan tidak dapat dihentikan.

</br>

+ **Arti Nama 'SnackGame'**

Arti nama dari `SnackGame` yaitu terdiri dari kata `Snack` yang berarti `Camilan` dan `Game` yang berarti `Permainan`. Makna dari dua frasa tersebut yaitu `SnackGame` ini merupakan sebuah game (permainan) yang membawa ular untuk terus memakan umpan (camilan). Sehingga pemain akan membuat ular untuk terus makan agar mendapatkan poin yang besar. Selain itu, pengucapan (improvisasi) kata `Snack` yang mirip dengan kata `Snake` yang berarti Ular. 

</br>

+ **Manfaat dan Tujuan**

Adapun manfaat dan tujuan dari pembuatan "SnackGame" ini yaitu :

| No. | Tujuan | Manfaat |
| ----------- | ----------- | ----------- |
| 1 | Melatih konsentrasi | Menerapkan materi pada Java OOP |
| 2| Melatih kemampuan motorik | Memenuhi Tugas Besar Mata kuliah Praktikum Pemrograman 2 |
| 3 | Mengembangkan kemampuan untuk problem solving | Menciptakan Media yang dapat menghibur |
| 4 | Sebagai media penghibur | - |

<hr>

## Dasar Teori

+ **Java OOP (Object Oriented Programming)**

`Java` adalah bahasa pemrograman yang biasa digunakan untuk mengembangkan bagian back-end dari software, aplikasi Android, dan juga website.  `Java` juga merupakan bahasa pemrograman tingkat tinggi yang berorientasi objek (OOP). `OOP` merupakan kepanjangan dari `Object Oriented Programming`. OOP merupakan suatu metode pemrograman yang berorientasi kepada objek. Dalam bahasa Indonesia OOP dikenal dengan `PBO (Pemrograman Berorientasi Objek)`. OOP bertujuan untuk mempermudah pengembangan sebuah program. Ia memiliki variabel dan fungsi yang dibungkus ke dalam `objek` ataupun `class`. Keduanya dapat saling berinteraksi sehingga membentuk sebuah program.

 </br>

+ **Materi-materi Java OOP**

Berikut ini adalah materi-materi PBO yang diimplementasikan pada pembuatan program `SnackGame` yaitu:

#### 📘 Modul 3 : Pengenalan Pemrograman Berorientasi Objek (PBO)

1. Class ☑️

`Class` bertugas untuk mengumpulkan prosedur/fungsi dan variabel dalam satu tempat. `Class` merupakan blueprint dari sebuah objek atau cetakan untuk membuat objek. Berikut penerapan   Class pada `SnackGame` yaitu:

> Class "MainGame" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/MainGame.java)

```java
package snackGame;

public class MainGame {
...
}
```

> Class "GameFrame" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GameFrame.java)

```java
package snackGame;
public class GameFrame extends JFrame {
...
}

```

> Class "GamePanel" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GamePanel.java)

```java
package snackGame;

public class GamePanel extends JPanel implements ActionListener {    
...
}
```

</br>

2. Atribut ☑️

`Atribut` merupakan bagian dari sebuah kelas yang masih berhubungan erat dari kelas tersebut. Atribut bisa juga disebut sebagai properti atau properties dari sebuah class. Penerapan Atribut pada `SnackGame` yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GamePanel.java)

```java
public class GamePanel extends JPanel implements ActionListener {                  
    static final int SCREEN_WIDTH = 600;                                              
    static final int SCREEN_HEIGHT = 600;                                        
    static final int UNIT_SIZE = 25;                                              
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/(UNIT_SIZE*UNIT_SIZE); 
    static final int DELAY = 175;                                                      
    final int x[] = new int[GAME_UNITS];                                                
    final int y[] = new int[GAME_UNITS];                                                
    private int bodyParts = 6;                                                          
    private int applesEaten;                                                            
    private int appleX;                                                                 
    private int appleY;                                                               
    private boolean running = false;                                                    
    private char direction = 'R';    
    
    ....
}
```

</br>

3. Method ☑️

`Method` berperan menjelaskan bagaimana suatu atribut beraksi. Peran yang dimaksud berupa tingkah laku (behavior) yang dapat digambarkan oleh suatu method. Penerapan Method-method pada Program `SnackGame` yaitu:

> Class "MainGame" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/MainGame.java)

```java
package snackGame;

public class MainGame {
    //method main
    public static void main(String[] args) {
        ...
    }
}

```

> Class "GamePanel" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GamePanel.java)

```java
package snackGame;

public class GamePanel extends JPanel implements ActionListener {                      

    public GamePanel () {
      ...
    }

    public void startGame() {
       ...
    }

    public void paintComponent(Graphics g) {
        ...
    }

    public void draw(Graphics g) {
       ...
    }

    public void newApple() {
        ...
    }

    public void move() {
        ...
    }

    public void checkApple() {                                                      
        ...
    }

    public void checkCollisions() {                                               
       ...
    }

    public void gameOver(Graphics g) {
        ...
    }

    @Override
    public void actionPerformed(ActionEvent e) {                                
        ...
    }

    //inner class (inheritance)
    public class MyKeyAdapter extends KeyAdapter{
        ...
    }
}

```
</br>

4. Object ☑️

Objek (Object) adalah sebuah variabel instance yang merupakan wujud dari class. Instance merupakan wujud dari sebuah kelas. Sebuah objek digambarkan dengan variable dan method.
Penerapan Object pada program `SnackGame` yaitu:

> Class "GameFrame" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GameFrame.java)

```java
package snackGame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame(){
        //mendeklarasikan object class GamePanel
        this.add(new GamePanel());
    }
}
```

</br>

####  📘 Modul 4 : Dasar Pemrograman Berorientasi Objek (PBO)

1. Information Hiding ☑️

Information Hiding adalah menyembunyikan attribute suatu objek dari objek lain. Informasi dari 'class' disembunyikan dari anggota-anggota lainnya agar 'class' lain tidak dapat mengaksesnya. Implementasi pada program `SnackGame` yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GamePanel.java)

```java
    private int bodyParts = 6;                      
    private int applesEaten;                        
    private int appleX;
    private int appleY;                     
    private boolean running = false;                
    private char direction = 'R';                 
```

2. Encapsulation (Enkapsulasi) ☑️

Encapsulation (Enkapsulasi) adalah suatu cara untuk menyembunyikan implementasi detail dari suatu class. Enkapsulasi mempunyai dua hal mendasar, yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GamePanel.java)

```java
public void draw(Graphics g) {
   ...
   //pada class FontMetrics ini menggunakan enkapsulasi untuk mendeklarasikan "metrics" untuk mendapatkan font yang diberikan ke method Graphics
   FontMetrics metrics = getFontMetrics(g.getFont());
   ...
    }
    
public void gameOver(Graphics g) {
        //Score
        ...
        //pada class FontMetrics ini menggunakan enkapsulasi untuk mendeklarasikan "metrics" untuk mendapatkan font yang diberikan ke method Graphics
        FontMetrics metrics1 = getFontMetrics(g.getFont());                          
        g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
        ...
        
        //Game Over text
        ...
        //pada class FontMetrics ini menggunakan enkapsulasi untuk mendeklarasikan "metrics" untuk mendapatkan font yang diberikan ke method Graphics
        FontMetrics metrics2 = getFontMetrics(g.getFont());                          
        ...
    }
```

</br>

3. Constructor ☑️

`Constructor` adalah suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Konstruktor ini merupakan method yang berfungsi untuk menginisialisasi variabel-variabel instans yang akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi kelas menjadi objek. Berikut penerapan `constructor` pada program `SnackGame` yaitu:

> Class "GameFrame" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GameFrame.java)

```java
package snackGame;

public class GameFrame extends JFrame {  //Class

    GameFrame(){  // ini adalah constructor
        ...  // isi dari constructor
    }
       // isi dari class
}
```

> Class "GamePanel" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GamePanel.java)

```java
package snackGame;

public class GamePanel extends JPanel implements ActionListener {  //Class                    

    public GamePanel () {   //ini adalah constructor
      ...  // isi constructor
    }
      // isi dari class
 }
 ```
 
 </br>

#### 📘 Modul 5 : Mengelola Class

1. Kata kunci "This" ☑️

Kata kunci ini digunakan dalam sebuah kelas untuk menyatakan object sekarang. Kata kunci `this` sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. `This` dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor. Berikut penerapan pada program `SnackGame` yaitu:

> Class "GameFrame" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GameFrame.java)

```java
package snackGame;

public class GameFrame extends JFrame {

    GameFrame(){
        this.add(new GamePanel());                              
        this.setTitle("Snack Game - Created by : Kelompok 3");  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_ CLOSE);    
        this.setResizable(false);                               
        this.pack();                                            
        this.setVisible(true);                                  
        this.setLocationRelativeTo(null);                       
    }
    
}
```

> Class "GamePanel" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GamePanel.java)

```java
package snackGame;

public class GamePanel extends JPanel implements ActionListener {                  

    public GamePanel () {   
      this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));              
        this.setBackground(Color.DARK_GRAY);                                            
        this.setFocusable(true);                                                        
        this.addKeyListener(new MyKeyAdapter());
    }
    
 }
 ```
</br>

#### 📘 Modul 6 : Konsep Inheritance

1. Inheritance ☑️

Inheritance merupakan salah satu dari 4 konsep Pemrograman Java yang fundamental Java. Inheritance bersifat krusial karena memiliki efek langsung pada bagaimana mendesain class-class. Konsep ini sebenarnya memiliki tujuan yaitu ketika membuat suatu class maka hanya perlu menspesifikasikan apa yang menjadi perbedaan antara suatu class dengan class lainnya, kemudian secara otomatis Inheritance ini akan memberikan akses otomatis terhadap informasi yang terkandung dari class lainnya. Keyword untuk Inheritance atau pewarisan adalah "Extends". Berikut penerapan pada program `SnackGame` yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GamePanel.java)

```java
package snackGame;

//Inheritance
public class GamePanel extends JPanel implements ActionListener {                  
      ...
       //inner class (inheritance)
    public class MyKeyAdapter extends KeyAdapter{
        @Override                                                        
        public void keyPressed(KeyEvent e) {
           
             
        }
    }
 }
 ```
 </br>
 
2. Kata kunci "Super" ☑️

Kata kunci "Super" dipakai untuk merujuk pada member dari Parent Class, bagaimana kata kunci this yang dipakai untuk merujuk pada anggota dari class itu sendiri.  Berikut penerapan pada program `SnackGame` yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GamePanel.java)

```java
package snackGame;

//Inheritance
public class GamePanel extends JPanel implements ActionListener {                  
      ...
    public void paintComponent(Graphics g) {
        super.paintComponent(g); //kata kunci super                                    
        draw(g);                                                           
    }
}
```

</br>

#### 📘 Modul 7 : Overloading dan Overriding

1. Overriding ☑️

Overriding merupakan suatu keadaan dimana kelas anak dapat mengubah atau bisa kita bilang memodifikasi atau memperluas data dan method pada kelas induk. Keuntungan Overriding : dapat menambahkan sifat / atribut pada kelas induk nya. Berikut penerapan pada program `SnackGame` yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GamePanel.java)

`Parent Class : `

> Class `KeyAdapter.java`

```java
public abstract class KeyAdapter implements KeyListener {
    
    public void keyPressed(KeyEvent e) {
    ...
    }
    
}
```

`Parent Class : `

> Class Interface `ActionListener.java`

```java
public interface ActionListener extends EventListener {

    public void actionPerformed(ActionEvent e);

}
```

`SubClass :`

```java
 //inner class (inheritance)
    public class MyKeyAdapter extends KeyAdapter{
        //Overriding method KeyPressed
        @Override                                                                   
        public void keyPressed(KeyEvent e) {
        ...
        }    
    }
     
    //Overriding pada method actionPerformed yaitu untuk memulai berjalannya game
    @Override
    public void actionPerformed(ActionEvent e) {                                   
       ...
    }
```

</br>

#### 📘 Modul 8 : Polimorfisme

1. Polimorfisme ☑️

`Polymorphism` (polimorfisme) adalah kemampuan untuk mempunyai beberapa bentuk class yang berbeda. Polimorfisme ini terjadi pada saat suatu obyek bertipe parent class, akan tetapi pemanggilan constructornya melalui `subclass`. Berikut penerapan pada program `SnackGame` yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/Java-OOP-SnackGame/blob/main/src/snackGame/GamePanel.java)

`Parent Class : `

> Class `KeyAdapter.java`

```java
public abstract class KeyAdapter implements KeyListener {
    
    public void keyPressed(KeyEvent e) {
    ...
    }
    
}
```

`Parent Class : `

> Class Interface `ActionListener.java`

```java
public interface ActionListener extends EventListener {

    public void actionPerformed(ActionEvent e);

}
```

`SubClass :`

```java
 //inner class (inheritance)
    public class MyKeyAdapter extends KeyAdapter{
        //Overriding method KeyPressed
        @Override                                                                   
        public void keyPressed(KeyEvent e) {
        ...
        }    
    }
     
    //Overriding pada method actionPerformed yaitu untuk memulai berjalannya game
    @Override
    public void actionPerformed(ActionEvent e) {                                   
       ...
    }
```

</br>  

#### 📘 Modul 9 : Exception

1. Blcok try-catch ☑️


+ **Tools yang Digunakan**

<hr>

## Implementasi

<hr>

## Kesimpulan













