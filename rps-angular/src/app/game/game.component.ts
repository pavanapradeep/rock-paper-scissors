import { Component } from '@angular/core';
import { GameService } from './../game.service';

import { library } from '@fortawesome/fontawesome-svg-core';
import { faHandBackFist, faHandPaper, faHandScissors, fas } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent {
  userChoice: string = '';
  computerChoice: string = '';
  gameResult: string = '';
  rockIcon = faHandBackFist;

  constructor(private gameService: GameService) {}
  
  playGame(choice: string) {
    this.gameService.playGame(choice).subscribe((data) => {
      this.userChoice = data.userChoice;
      this.computerChoice = data.computerChoice;
      this.gameResult = data.result;
    });
  }
}
