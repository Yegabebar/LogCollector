package com.yegabebar.logcollector.agent;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//On v�rifie si le dossier de travail existe
		String Directory = "C:/LogCollector/";
		File workDirectory = new File(Directory);
		String procmonZipURL = "https://download.sysinternals.com/files/ProcessMonitor.zip";
		String procmonFullPath = Directory+"ProcessMonitor.zip";
		
		//S'il n'existe pas, on le cr�e et on v�rifie: int�gre un catch mais pas s�r que pertinent dans une fonction
		if(!workDirectory.exists()){fileClass.createAndCheck(Directory);}
		
		//On dl procmon
		fileClass.downloadFile(procmonZipURL, procmonFullPath);
		
		//Puis on le lance via commande (m�thode d'ex�cution de programme?)
		
		
	}

}
