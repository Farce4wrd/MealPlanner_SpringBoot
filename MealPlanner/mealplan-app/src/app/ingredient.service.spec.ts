import { TestBed } from '@angular/core/testing';

import { IngredientService } from './ingredient.service';
import { HttpClientModule }  from '@angular/common/http';

describe('IngredientService', () => {
  let service: IngredientService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports:[
        HttpClientModule
      ]
    });
    service = TestBed.inject(IngredientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
