package com.godstime.HRMgtSystem.base.userEntity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Image {
    private String id;
    private String url;
    private int bytes;
    private String format;
    private int height;
    private int width;
}
