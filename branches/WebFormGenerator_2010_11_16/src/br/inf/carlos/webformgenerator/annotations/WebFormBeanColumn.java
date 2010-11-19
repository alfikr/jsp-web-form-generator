package br.inf.carlos.wfg.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import br.inf.carlos.wfg.enums.WebFormComponentType;

/**
 * Esta Annotation class define todos os atributos mapeáveis para
 * um determinado Bean.
 * 
 * @author Carlos A. Junior
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface WebFormBeanColumn
{
	/**
	 * Seta o tipo do componente HTML a ser gerado. O padrão é o tipo TEXT definida na 
	 * classe ENUM WebFormComponentType
	 * 
	 * @return void
	 * 
	 * @see WebFormComponentType
	 */
	public WebFormComponentType 	type() 			default WebFormComponentType.TEXT;
	
	/**
	 * Seta o comprimento do componente HTML. Somente será colocado em elementos do tipo 
	 * TEXT.
	 * 
	 * @return void
	 */
	public int 						size() 			default 30;
	
	/**
	 * Seta o tamanho máximo de caracteres permitidos dentro do componente HTML. Somente
	 * será colocado em elementos do tipo TEXT.
	 * 
	 * @return void
	 */
	public int 						maxLength() 	default 30;
	
	/**
	 * Seta o nome da classe CSS a ser utilizada no componente HTML. O padrão
	 * caso não informado é 'inputbox'.
	 * 
	 * @return void
	 */
	public String 					cssClass() 		default "inputbox";
	
	/**
	 * Seta o ID do componente HTML. Caso fique em branco o padrão será o 
	 * próprio nome do java.lang.Field da classe Bean mapeada.
	 * 
	 * @return void
	 */
	public String 					id() 			default "";
	
	/**
	 * Seta o nome do componente HTML. Caso fique em branco o padrão será o 
	 * próprio nome do java.lang.Field da classe Bean mapeada.
	 * 
	 * @return void
	 */
	public String 					name() 			default "";
	
	/**
	 * Seta o label que irá aparecer na parte de cima do componente HTML.
	 * 
	 * @return void
	 */
	public String 					label()			default "";
	
	/**
	 * Seta o valor (value) para o elemento HTML. Caso seja um SELECT será 
	 * necessário informar o atributo elements
	 * 
	 * @return void
	 */
	public String[]					value()			default "";
	
	/**
	 * Seta o nome da variável que irá ser conter a coleção de elementos a ser mostrada
	 * no arquivo JSP gerado. Irá implementar a iteração através da tag c:foreach
	 * 
	 * @return void
	 */
	public String 					elements()		default "";
	
	/**
	 * Seta a quantidade de colunas para o componente TextArea.
	 * 
	 * @return void
	 */
	public int						cols () 		default 80;
	
	/**
	 * Seta a quantidade de linhas para o componente TextArea.
	 * 
	 * @return void
	 */
	public int						rows () 		default 10;
	
	public String					mascara()		default "";
}
