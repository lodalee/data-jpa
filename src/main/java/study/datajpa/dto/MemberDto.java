package study.datajpa.dto;

import lombok.Data;

@Data
public class MemberDto {

    private Long di;
    private String username;
    private String teamName;

    public MemberDto(Long di, String username, String teamName) {
        this.di = di;
        this.username = username;
        this.teamName = teamName;
    }
}
