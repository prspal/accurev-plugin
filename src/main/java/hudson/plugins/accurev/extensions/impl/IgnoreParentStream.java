package hudson.plugins.accurev.extensions.impl;

import javax.annotation.Nonnull;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;

import hudson.plugins.accurev.extensions.AccurevSCMExtension;
import hudson.plugins.accurev.extensions.AccurevSCMExtensionDescriptor;

public class IgnoreParentStream extends AccurevSCMExtension {

    @DataBoundConstructor
    public IgnoreParentStream() {
    }

    @Extension
    public static class DescriptorImpl extends AccurevSCMExtensionDescriptor {
        @Override
        @Nonnull
        public String getDisplayName() {
            return "Ignore parent changes";
        }
    }
}
