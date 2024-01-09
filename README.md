# curso-springboot-jpa


# Criar nova Entidade:

checklist:
- [ ] Basic attributes
Ex.:
...
	private Long id;
	private String nome;
...
- [ ] Associations (instantiate collections)
- [ ] Constructors
Ex.:
	public Categoria() {		
	}

	public Categoria(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
- [ ] Getters & Setters (collections: only get)
Ex.:
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
- [ ] hashCode & equals
Ex.:
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
- [ ] Serializable
Ex.:
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}

- [ ] JPA ANotations

# Criar novo Repositorio

# Criar novo Service

# Criar novo Resourse
