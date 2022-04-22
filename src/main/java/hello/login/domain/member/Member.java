package hello.login.domain.member;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class Member {

	private Long id; 
	@NotEmpty
	private String loginId; // �α��ξ��̵�
	@NotEmpty
	private String name; // ����� �̸�
	@NotEmpty
	private String password;
}
