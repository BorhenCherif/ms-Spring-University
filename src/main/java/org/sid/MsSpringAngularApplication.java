package org.sid;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@SpringBootApplication
public class MsSpringAngularApplication implements CommandLineRunner   {
	@Autowired
	private EtudiantRepository etudiantRepository;

	@Autowired
	private FormationRepository formationRepository;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(MsSpringAngularApplication.class, args);
	}

	

	@Override
	public void run(String... args) throws Exception {
        
		repositoryRestConfiguration.exposeIdsFor(Etudiant.class,Formation.class);
		Formation F1=formationRepository.save(new Formation(null,"NodeJS",20,null));
		Formation F2=formationRepository.save(new Formation(null,"PHP",30,null));
		Formation F3=formationRepository.save(new Formation(null,"React",10,null));

		
		etudiantRepository.save(new Etudiant(null, "mohamed","ahmed",new Date(),F1));
		etudiantRepository.save(new Etudiant(null, "hsan","tounsi",new Date(),F1));
		etudiantRepository.save(new Etudiant(null, "fathi","naceur",new Date(),F2));
		etudiantRepository.save(new Etudiant(null, "khalil","mousa",new Date(),F3));
		
	}

}
