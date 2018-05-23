package com.litchi.bean.vo;

/**
 * @author gehuadong
 * @create 2018-05-23 16:07
 **/
public class PageResult {
    /**
     * 当前页
     */
    private int current;

    /**
     * 每页显示多少条
     */
    private int size;

    /**
     * 总条数
     */
    private long total;

    /**
     * 总页数
     */
    private long pages;

    private Object data;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getPages() {
        return total / size + (total % size == 0 ? 0 : 1);
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
