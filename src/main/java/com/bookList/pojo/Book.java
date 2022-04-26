package com.bookList.pojo;

public class Book {
    private Integer id;
    private String author;
    private String description;
    private String name;
    private Integer status;

    public Book() {
    }

    public Book(Integer id, String author, String description, String name, int status) {
        this.id = id;
        this.author = author;
        this.description = description;
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
