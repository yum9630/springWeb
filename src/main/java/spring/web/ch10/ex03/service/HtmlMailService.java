package spring.web.ch10.ex03.service;

import spring.web.ch10.ex03.domain.Message;

public interface HtmlMailService {
	void send(Message msg);

}
