package br.com.treinaweb.ediaristas.core.models;

import java.math.BigDecimal;
import java.util.Objects;

import br.com.treinaweb.ediaristas.core.enums.Icone;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "servicos")
@Data
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Servico {

	@EqualsAndHashCode.Include
	@ToString.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(name = "valor_minimo", nullable = false)
	private BigDecimal valorMinimo; // BigDecimal é aconselhável para valores monetários
	
	@Column(name = "quantidade_horas", nullable = false)
	private Integer quantidadeHoras;
	
	@Column(name = "percentagem_comissao", nullable = false)
	private BigDecimal percentagemComissao;
	
	@Column(name = "horas_quarto", nullable = false)
	private Integer horasQuarto;
	
	@Column(name = "valor_quarto", nullable = false)
	private BigDecimal valorQuarto;
	
	@Column(name = "horas_sala", nullable = false)
	private Integer horasSala;

	@Column(name = "valor_sala", nullable = false)
	private BigDecimal valorSala;
	
	@Column(name = "horas_banheiro", nullable = false)
	private Integer horasBanheiro;

	@Column(name = "valor_banheiro", nullable = false)
	private BigDecimal valorBanheiro;
	
	@Column(name = "horas_cozinha", nullable = false)
	private Integer horasCozinha;

	@Column(name = "valor_cozinha", nullable = false)
	private BigDecimal valorCozinha;
	
	@Column(name = "horas_quintal", nullable = false)
	private Integer horasQuintal;
	
	@Column(name = "valor_quintal", nullable = false)
	private BigDecimal valorQuintal;
	
	@Column(name = "horas_outros", nullable = false)
	private Integer horasOutros;

	@Column(name = "valor_outros", nullable = false)
	private BigDecimal valorOutros;
	
	@Column(nullable = false, length = 14)
	@Enumerated(EnumType.STRING)
	private Icone icone;
	
	@Column(nullable = false)
	private Integer posicao;
	
	// public Servico() {}

	// public Servico(Long id, String nome, BigDecimal valorMinimo, Integer quantidadeHoras,
	// 		BigDecimal percentagemComissao, Integer horasQuarto, BigDecimal valorQuarto, Integer horasSala,
	// 		BigDecimal valorSala, Integer horasBanheiro, BigDecimal valorBanheiro, Integer horasCozinha,
	// 		BigDecimal valorCozinha, Integer horasQuintal, BigDecimal valorQuintal, Integer horasOutros,
	// 		BigDecimal valorOutros, Icone icone, Integer posicao) {
	// 	super();
	// 	this.id = id;
	// 	this.nome = nome;
	// 	this.valorMinimo = valorMinimo;
	// 	this.quantidadeHoras = quantidadeHoras;
	// 	this.percentagemComissao = percentagemComissao;
	// 	this.horasQuarto = horasQuarto;
	// 	this.valorQuarto = valorQuarto;
	// 	this.horasSala = horasSala;
	// 	this.valorSala = valorSala;
	// 	this.horasBanheiro = horasBanheiro;
	// 	this.valorBanheiro = valorBanheiro;
	// 	this.horasCozinha = horasCozinha;
	// 	this.valorCozinha = valorCozinha;
	// 	this.horasQuintal = horasQuintal;
	// 	this.valorQuintal = valorQuintal;
	// 	this.horasOutros = horasOutros;
	// 	this.valorOutros = valorOutros;
	// 	this.icone = icone;
	// 	this.posicao = posicao;
	// }

	// public Long getId() {
	// 	return id;
	// }

	// public void setId(Long id) {
	// 	this.id = id;
	// }

	// public String getNome() {
	// 	return nome;
	// }

	// public void setNome(String nome) {
	// 	this.nome = nome;
	// }

	// public BigDecimal getValorMinimo() {
	// 	return valorMinimo;
	// }

	// public void setValorMinimo(BigDecimal valorMinimo) {
	// 	this.valorMinimo = valorMinimo;
	// }

	// public Integer getQuantidadeHoras() {
	// 	return quantidadeHoras;
	// }

	// public void setQuantidadeHoras(Integer quantidadeHoras) {
	// 	this.quantidadeHoras = quantidadeHoras;
	// }

	// public BigDecimal getPercentagemComissao() {
	// 	return percentagemComissao;
	// }

	// public void setPercentagemComissao(BigDecimal percentagemComissao) {
	// 	this.percentagemComissao = percentagemComissao;
	// }

	// public Integer getHorasQuarto() {
	// 	return horasQuarto;
	// }

	// public void setHorasQuarto(Integer horasQuarto) {
	// 	this.horasQuarto = horasQuarto;
	// }

	// public BigDecimal getValorQuarto() {
	// 	return valorQuarto;
	// }

	// public void setValorQuarto(BigDecimal valorQuarto) {
	// 	this.valorQuarto = valorQuarto;
	// }

	// public Integer getHorasSala() {
	// 	return horasSala;
	// }

	// public void setHorasSala(Integer horasSala) {
	// 	this.horasSala = horasSala;
	// }

	// public BigDecimal getValorSala() {
	// 	return valorSala;
	// }

	// public void setValorSala(BigDecimal valorSala) {
	// 	this.valorSala = valorSala;
	// }

	// public Integer getHorasBanheiro() {
	// 	return horasBanheiro;
	// }

	// public void setHorasBanheiro(Integer horasBanheiro) {
	// 	this.horasBanheiro = horasBanheiro;
	// }

	// public BigDecimal getValorBanheiro() {
	// 	return valorBanheiro;
	// }

	// public void setValorBanheiro(BigDecimal valorBanheiro) {
	// 	this.valorBanheiro = valorBanheiro;
	// }

	// public Integer getHorasCozinha() {
	// 	return horasCozinha;
	// }

	// public void setHorasCozinha(Integer horasCozinha) {
	// 	this.horasCozinha = horasCozinha;
	// }

	// public BigDecimal getValorCozinha() {
	// 	return valorCozinha;
	// }

	// public void setValorCozinha(BigDecimal valorCozinha) {
	// 	this.valorCozinha = valorCozinha;
	// }

	// public Integer getHorasQuintal() {
	// 	return horasQuintal;
	// }

	// public void setHorasQuintal(Integer horasQuintal) {
	// 	this.horasQuintal = horasQuintal;
	// }

	// public BigDecimal getValorQuintal() {
	// 	return valorQuintal;
	// }

	// public void setValorQuintal(BigDecimal valorQuintal) {
	// 	this.valorQuintal = valorQuintal;
	// }

	// public Integer getHorasOutros() {
	// 	return horasOutros;
	// }

	// public void setHorasOutros(Integer horasOutros) {
	// 	this.horasOutros = horasOutros;
	// }

	// public BigDecimal getValorOutros() {
	// 	return valorOutros;
	// }

	// public void setValorOutros(BigDecimal valorOutros) {
	// 	this.valorOutros = valorOutros;
	// }

	// public Icone getIcone() {
	// 	return icone;
	// }

	// public void setIcone(Icone icone) {
	// 	this.icone = icone;
	// }

	// public Integer getPosicao() {
	// 	return posicao;
	// }

	// public void setPosicao(Integer posicao) {
	// 	this.posicao = posicao;
	// }

	// @Override
	// public int hashCode() {
	// 	return Objects.hash(id);
	// }

	// @Override
	// public boolean equals(Object obj) {
	// 	if (this == obj)
	// 		return true;
	// 	if (obj == null)
	// 		return false;
	// 	if (getClass() != obj.getClass())
	// 		return false;
	// 	Servico other = (Servico) obj;
	// 	return Objects.equals(id, other.id);
	// }

	// @Override
	// public String toString() {
	// 	return "Servico [id=" + id + ", nome=" + nome + ", valorMinimo=" + valorMinimo + ", quantidadeHoras="
	// 			+ quantidadeHoras + ", percentagemComissao=" + percentagemComissao + ", horasQuarto=" + horasQuarto
	// 			+ ", valorQuarto=" + valorQuarto + ", horasSala=" + horasSala + ", valorSala=" + valorSala
	// 			+ ", horasBanheiro=" + horasBanheiro + ", valorBanheiro=" + valorBanheiro + ", horasCozinha="
	// 			+ horasCozinha + ", valorCozinha=" + valorCozinha + ", horasQuintal=" + horasQuintal + ", valorQuintal="
	// 			+ valorQuintal + ", horasOutros=" + horasOutros + ", valorOutros=" + valorOutros + ", icone=" + icone
	// 			+ ", posicao=" + posicao + "]";
	// }
}