package com.pw.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

//@Schema(
//        name = "Response",
//        description = "Schema to hold successful response information"
//)
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ResponseDto {

//    @Schema(
//            description = "Status code in the response"
//    )
    private String statusCode;

//    @Schema(
//            description = "Status message in the response"
//    )
    private String statusMsg;

}
