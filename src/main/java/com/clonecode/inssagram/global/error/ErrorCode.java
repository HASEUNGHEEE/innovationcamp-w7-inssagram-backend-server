package com.clonecode.inssagram.global.error;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {

    //Common
    SUCCESS(200, "SUCCESS", "통신에 성공했습니다."),
    SERVER_ERROR(500, "SERVER_ERROR", "서버가 폭발했습니다~"),

    ENTITY_NOT_FOUND(400, "Entity Not Found", "존재하지 않습니다."),

    //User
    INVALID_USER(400, "INVALID_USER", "비밀번호가 일치하지 않습니다"),
    DUPLICATED_EMAIL(400, "DUPLICATED_EMAIL", "중복된 이메일입니다."),
    USER_NOT_FOUND(404, "USER_NOT_FOUND", "해당 유저가 존재하지 않습니다."),
    PASSWORD_NOT_MATCHED(400, "PASSWORDS_NOT_MATCHED", "비밀번호와 비밀번호 확인이 일치하지 않습니다."),
    LOGIN_REQUIRED(400, "LOGIN_REQUIRED", "로그인이 필요합니다."),
    USER_UNAUTHORIZED(401, "USER_UNAUTHORIZED", "유저 정보는 본인만 수정 가능합니다."),

    //Post
    POST_NOT_FOUND(400, "POST_NOT_FOUND", "존재하지 않는 게시글입니다."),
    POST_UNAUTHORIZED(401, "POST_UNAUTHORIZED", "게시글에 대한 권한이 없습니다."),

    //Comment
    COMMENT_NOT_FOUND(400, "COMMENT_NOT_FOUND", "존재하지 않는 댓글입니다."),
    COMMENT_UNAUTHORIZED(401, "COMMENT_UNAUTHORIZED", "댓글에 대한 권한이 없습니다."),

    //Token
    INVALID_TOKEN(400, "INVALID_TOKEN", "Token이 유효하지 않습니다."),
    TOKEN_NOT_FOUND(400, "TOKEN_NOT_FOUND", "존재하지 않는 Token 입니다."),
    NOT_LOGIN_STATE(400, "NOT_LOGIN_STATE", "로그인 상태가 아닙니다."),

    NOT_PASS_VALIDATION(400, "NOT_PASS_VALIDATION", "유효성 검사를 통과하지 못했습니다."),

//    S3
    NO_FILE_TO_UPLOAD(400, "NO_FILE_TO_UPLOAD", "파일을 업로드해주세요"),
    UPLOAD_FAILED(400, "UPLOAD_FAILED", "S3 Bucket 객체 업로드 실패."),

    DELETE_FAILED(400, "DELETE_FAILED", "S3 Bucket 객체 삭제 실패."),

    INVALID_IMAGE_FILE_EXTENSION(400, "INVALID_IMAGE_FILE_EXTENSION", "bmp,jpg,jpeg,png 형식의 이미지 파일이 요구됨.");

    private final int status;
    @ApiModelProperty(example = "데이터 교환 실패시 code")
    private final String code;
    @ApiModelProperty(example = "데이터 교환 실패시 message")
    private final String message;

}
