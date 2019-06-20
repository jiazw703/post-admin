package com.post.admin.postadmin.domain;

import java.util.List;

public class pageUtil {


    private List rows;

    private Integer page;// 当前页

    private Integer total;// 总页数

    private Integer pageSize ;// 每页显示多少

    private Long records;// 总记录数

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getRecords() {
        return records;
    }

    public void setRecords(Long records) {
        this.records = records;
    }

    public pageUtil(List rows, Integer page, Integer total, Integer pageSize, Long records) {
        this.rows = rows;
        this.page = page;
        this.total = total;
        this.pageSize = pageSize;
        this.records = records;
    }
}
