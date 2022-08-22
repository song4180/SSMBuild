package com.sqw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("Books")
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
