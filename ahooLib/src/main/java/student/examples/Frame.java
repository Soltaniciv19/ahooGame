package student.examples;


import java.io.Serializable;

public class Frame implements Serializable {
    private final static long serialVersionUID = 1L;
    private Object header;
    private Object body;

    public Frame(Object header, Object body){
        this.header = header;
        this.body = body;
    }

    public Object getHeader() {
        return header;
    }

    public void setHeader(Object header) {
        this.header = header;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
