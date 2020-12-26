package com.example.demo.jobs;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class TarefaAgendada {

	private static final String TIME_ZONE = "America/Sao_Paulo";
	private final long DELAY = 600000L;

	//@Autowired
	// Classe de negócio a ser instanciada

	@Scheduled(cron = "0 0 1 * * *", zone = TIME_ZONE)
	public void rotinaCriacaoDePedidoAtualizacao() {
		// método negocial que deve ser ativado e executado
	}

	@Scheduled(initialDelay = 0L, fixedDelay = DELAY)
	public void rotinaMunicipal() {
		// método negocial que deve ser ativado e executado
	}
}