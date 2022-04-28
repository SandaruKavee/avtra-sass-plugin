package com.sass.compile.sasscompileavtra;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;


@Mojo(name ="resourceSass",defaultPhase = LifecyclePhase.INITIALIZE)
public class SassCompileAvtraApplication extends AbstractMojo{

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("First");
		
	}

}
 