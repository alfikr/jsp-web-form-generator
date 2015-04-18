# Introduction #

This a simple sample to show how to use the WFG to generate yours HTML forms.

# Use #

To generate all HTML files you only create a simple class with main method. You will need create an WebFormApplication to create all files. See the code follow:

```
package br.inf.carlos.wfg.teste.run;

import java.io.IOException;

import br.inf.carlos.wfg.WebFormApplication;

public class Teste {
	
	public static void main(String[] args)
	{
		WebFormApplication app = new WebFormApplication(
			"br.inf.carlos.wfg.teste.beans",
			"WebContent/jsp/",
			"jsp"
		);
		
		try {
			app.buildWebForms();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

```

Before execute, you will need verify that your target WebContent directory has write and read permissions.

After generated, you can customize only necessary parts, like that positions, custom javascript functions, etc.

Follow the generated content for one mapped class.

```
<div>
	<fieldset>
		<form action='' method='post'>
			<table width='100%' border='0'>
				<tr>
					<td>
						 <label>
							Nome: 
							<br/>
							<input type='text' class='inputbox'  size='50'  id='nome' name='cidade.nome'  maxlength='200' />
						</label>
					</td>
				</tr>
				<tr>
					<td>
						 <label>
							Telefone: 
							<br/>
							<input type='text' class='inputbox'  size='20'  id='telefone' name='cidade.telefone'  maxlength='20' />
						</label>
					</td>
				</tr>
			</table>
		</form>
	</fieldset>
</div>
<script type='text/javascript' src='https://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js'>
<script type='text/javascript' src='http://jquery-joshbush.googlecode.com/files/jquery.maskedinput-1.2.2.min.js'>
</script>

<script type='text/javascript'>
	jQuery('#telefone').mask('(99)9999-9999');
	jQuery('#telefoneTrabalho').mask('(99)9999-9999');
</script>

```

# Javascript Mask #

You can insert directly in attributes annotations the mask for field, like that phone numbers, credit cards, date fields, etc.

This frameworks uses the jQuery MaskedInput plugin and the jQuery across Google APIs site. All credits these scripts are theirs owners, this framework only use them.