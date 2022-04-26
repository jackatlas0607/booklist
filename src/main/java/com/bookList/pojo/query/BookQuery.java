package com.bookList.pojo.query;

public class BookQuery {
    private Integer pageNum = 1;   // 當前頁數
    private Integer pageSize  = 10;   //每一頁顯示數量
    private String name;    // 根據書名查詢

    public BookQuery() {
    }

    public BookQuery(Integer pageNum, Integer pageSize, String name) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.name = name;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
