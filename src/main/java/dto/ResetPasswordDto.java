package dto;

import lombok.Data;

@Data
public class ResetPasswordDto {
    private String eMail;
    private String newpassword;
    private String confirmNewPassword;
}
