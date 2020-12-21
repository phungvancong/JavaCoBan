package comm.trungtamjava.model;

import java.util.Scanner;

public class CourseScore {
    int id;
    String name;
    float score;

    public CourseScore(){

    }
    public CourseScore(int id, String name, float score){
        this.id= id;
        this.name= name;
        this.score= score;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    public void input(){
        System.out.println("Enter the info");
        System.out.println("Enter the id ");
        Scanner scId= new Scanner(System.in);
        id= scId.nextInt();

        System.out.println("Enter the name ");
        Scanner scName= new Scanner(System.in);
        name= scName.nextLine();

        System.out.println("Enter the score ");
        Scanner scScore= new Scanner(System.in);
        score= scScore.nextFloat();

    }
    public void info(){
        System.out.println(id);
        System.out.println(name);
        if (score<5){
            System.out.println("hoc sinh yeu");
        }else if (score>=5 && score<7){
            System.out.println("hoc sinh trung binh");
        }else if (score>=7 && score<8){
            System.out.println("hoc sinh kha");
        }else if (score>=8 && score<9){
            System.out.println("hoc sinh gioi");
        }else {
            System.out.println("hoc sinh Xuat sac");
        }System.out.println("---------");
    }
}
