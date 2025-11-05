1- Instalação de Programas
jdk-24_windows-x64_bin
MySQL WorkBenck 8.0
Apache-NetBeans-25-bin-windows-x64
xampp-windows-x64-8.0.30-0-VS16-installer
mysql-connector-j-9.2.0


2- Execução do Sistema
Iniciar o servidor MySQL (via XAMPP)
Iniciar o XAMPP e acessar o http://localhost/phpmyadmin


3- Criação do banco de dados
CREATE DATABASE IF NOT EXISTS academia_db
    DEFAULT CHARACTER SET utf8mb4
    COLLATE utf8mb4_general_ci;

-- Seleciona o banco de dados
USE academia_db;

-- Criação da tabela Aluno
CREATE TABLE IF NOT EXISTS Aluno (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  cpf VARCHAR(14) NOT NULL,
  data_nascimento DATE NOT NULL,
  telefone VARCHAR(20),
  email VARCHAR(100),
  endereco VARCHAR(200),
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Criação da tabela Treino
CREATE TABLE IF NOT EXISTS Treino (
  id INT NOT NULL AUTO_INCREMENT,
  aluno_id INT,
  tipo_treino VARCHAR(50),
  descricao TEXT,
  duracao_minutos INT,
  data_inicio DATE,
  PRIMARY KEY (id),
  FOREIGN KEY (aluno_id) REFERENCES Aluno(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


4-
No NetBeansApache:
Configuração do Projeto
Criar novo projeto Java Application
Adicionar driver do MySQL:
Botão direito no projeto > Properties > Libraries
Clicar em "Add JAR/Folder"
Selecionar o arquivo mysql-connector-j-9.2.0.jar
Criar pacotes no projeto:
DAO
academia
GUI


5-
Funcionalidades no NetBeans
Tela de Alunos (FichaGUI)
Cadastro de novos alunos
Visualização em tabela
Botão de Incluir

Tela de Treinos (TreinoGUI)
Cadastro de treinos associados a alunos
Listagem de todos os treinos
Filtro por ID de aluno
Exclusão de treinos


6-
Notas Importantes
O sistema usa GregorianCalendar para manipulação de datas
As datas devem ser inseridas no formato yyyy-MM-dd
A conexão padrão usa:
URL: jdbc:mysql://localhost:3306/academia_db
Usuário: root
Senha: vazia (ajustar se necessário no Conexao.java)