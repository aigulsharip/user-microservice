package kz.middle.userservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class UserDto {

    private Long id;
    private String email;
    private String login;
    private String fullName;

}