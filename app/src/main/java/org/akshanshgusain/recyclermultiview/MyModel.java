package org.akshanshgusain.recyclermultiview;

public class MyModel {
    private String title;
    private int type;
    public static final int FIRST_TYPE=1;
    public final static int SECOND_TYPE=2;
    public final static int THIRD_TYPE=3;

    public MyModel(String title, int type) {
        this.title = title;
        this.type=type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
