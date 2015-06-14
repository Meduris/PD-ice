/*
 * Pixel Dungeon
 * Copyright (C) 2012-2014  Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.shatteredpixel.shatteredicepixeldungeon.levels.painters;

import com.shatteredpixel.shatteredicepixeldungeon.Dungeon;
import com.shatteredpixel.shatteredicepixeldungeon.levels.Level;
import com.shatteredpixel.shatteredicepixeldungeon.levels.Room;
import com.shatteredpixel.shatteredicepixeldungeon.levels.SewerBossLevel;
import com.shatteredpixel.shatteredicepixeldungeon.levels.SewerLevel;
import com.shatteredpixel.shatteredicepixeldungeon.levels.Terrain;

public class EntrancePainter extends Painter {

	public static void paint(Level level, Room room) {

		fill(level, room, Terrain.WALL);
		fill(level, room, 1, Terrain.EMPTY);

		for (Room.Door door : room.connected.values()) {
			door.set(Room.Door.Type.REGULAR);
		}

		/*
		 * if (!Dungeon.bossLevel() && Dungeon.depth < 5) { // level.entrance =
		 * room.random(1); level.entrance = room.top * Level.WIDTH +
		 * (room.right); set(level, level.entrance, Terrain.ENTRANCE); } else if
		 * (Dungeon.bossLevel() && Dungeon.depth == 5) {
		 */
		
		// TODO test this, taken from shattered sewerbosslevel generation
		if (Dungeon.depth <= 5) {
			// TODO entrance is set to the correct position, but the sprite is
			// not displayed there before goo is killed
			// level.entrance = room.top * Level.WIDTH + (room.right - 1);
			level.entrance = room.top * (Level.WIDTH) + Level.WIDTH
					+ (room.right - 1);
			set(level, level.entrance, Terrain.ENTRANCE);
		} else {
			level.entrance = room.random(1);
			set(level, level.entrance, Terrain.ENTRANCE);
		}
	}

}
