package com.atguigu.springcloud.entities;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Payment implements Serializable {
    private Long id;

    private String serial;
}
