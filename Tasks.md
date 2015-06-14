New implemented stuff
=============
A list of all currently changed things:
- [x] the entrance in the first 5 floors is in the upper right corner
- [x] the function which causes the sad ghost to be barely visible (nearly invisible with the current tileset) was removed from com/shatteredpixel/shatteredicepixeldungeon/sprites/GhostSprite.java
- [x] added a function to switch to reverse landscape (available since android api level 9) 

Things have to be fixed
============
- [ ] it can be that there are doors next to the entrance
- [ ] change the sad ghosts sprite (currently a testsprite with gaudy colors)
- [ ] walls in terrain.java have to be set to normal behavior
- [ ] don't give the mage 20 potions of mind vision at the beginning
- [ ] reset all the other starting stats
- [ ] on the floors 1 to 5 potion of mind vision disables the heros field of view, you can only see the small region around the enemys
- [ ] also on the floors 1 to 5: the heros field of view is also disablen in the gardens, also what you see from the garden will be only updated if you exit the room, wait for the end of the gardens effect and then reenter the garden 

See [my other branch](https://github.com/Sarius997/PD-ice/tree/first-version-without-cheats) for a version without cheats
============

Reverse landscape:
============
1. change to landscape --> enables the "reverse landscape" checkbox
2. check the "reverse landscape" checkbox

Note: "reverse landscape" is currently not saved if you exit the game and is also resetted if you change to portrait
