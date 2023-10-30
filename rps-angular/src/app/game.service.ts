import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class GameService {
  private baseUrl = 'http://localhost:8080/api/game';

  constructor(private http: HttpClient) {}

  playGame(userChoice: string): Observable<any> {
    return this.http.post(`${this.baseUrl}/play`, { choice: userChoice });
  }
}
