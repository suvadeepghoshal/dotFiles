# Suvadeep Ghoshal Configuration

**Warning!!** Do't blindly use this settings unless you know what that means. Use at your own risk.

### Details

Contains my neovim configuration, my powershell configuration for windows.

### Structure

*Poweshell*

**For Unix and Mac Users the nvim directory will be under the .config directory itself**

$home/
  .config/
    powershell/
      user_profile.ps1
      sgzoid.omp.json

*Neovim*

$home/
  .AppData/
    Local/
      nvim/
      init.vim
      maps.vim
      colors/
        NeoSolarized.vim
      plugged/
        for all plugins by vim plug

## Contents

### Vim Setup

- Neovim
- [vim-plug](https://github.com/junegunn/vim-plug) - A minimalist Vim plugin manager

### Powershell Setup

- [Scoop](https://scoop.sh/) -  A command-line installer
- [Git for windows](https://gitforwindows.org/)
- [Oh my Posh](https://ohmyposh.dev/) - Prompt theme engine
- [Terminal Icons](https://github.com/devblackops/Terminal-Icons) - Folder and file icons
- [PSReadLine](https://docs.microsoft.com/en-us/powershell/module/psreadline/) - Cmdlets for customizing the editing environment, used for autocompletion
- [z](https://www.powershellgallery.com/packages/z) - Directory Jumper
- [Fuzzy Finder](https://github.com/kelleyma49/PSFzf)
