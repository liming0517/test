package TankGme;

class Tank {

    //定位横坐标
    int x = 100;
    //定位纵坐标
    int y = 100;
    //定义方向 0-->上；1-->下；2-->左；3-->右;
    int direct = 0;
    //定义速度
    int speed = 3;
    //坦克类型 0-->红色；1 蓝色 ；2 黄色
    int type = 2;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void moveUp(){
          this.y-=this.speed;
    }
    public void  moveDown(){
     this.y+=this.speed;
    }
    public void moveLeft(){
        this.x-=this.speed;
    }
    public void moveRight(){
        this.x+=this.speed;
    }
}

class MyTank extends Tank {
    public MyTank(int x, int y) {
        super(x, y);
    }
}