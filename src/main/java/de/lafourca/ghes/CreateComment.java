package de.lafourca.ghes;

import java.io.IOException;

import org.kohsuke.github.GHEventPayload;

import io.quarkiverse.githubapp.event.PullRequest;

class CreateComment {

	void onOpen(@PullRequest.Opened GHEventPayload.PullRequest prPayload) throws IOException {
		prPayload.getPullRequest().comment("Hello from my GitHub App");
	}
}